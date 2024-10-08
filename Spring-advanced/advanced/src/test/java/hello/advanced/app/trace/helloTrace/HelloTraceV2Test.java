package hello.advanced.app.trace.helloTrace;

import hello.advanced.app.trace.TraceStatus;
import org.junit.jupiter.api.Test;

class HelloTraceV2Test {
    @Test
    public void begin_end() throws Exception{
        //given
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(), "hello2");
        trace.end(status2);
        trace.end(status1);

    }
    @Test
    public void begin_exception(){
        //given
        HelloTraceV2 trace = new HelloTraceV2();
        TraceStatus status1 = trace.begin("hello1");
        TraceStatus status2 = trace.beginSync(status1.getTraceId(), "hello2");
        trace.exception(status1, new IllegalStateException());
        trace.exception(status2, new IllegalStateException());

    }

}