package hello.advanced.app.trace.helloTrace;

import hello.advanced.app.trace.TraceStatus;
import org.junit.jupiter.api.Test;

class HelloTraceV1Test {
    @Test
    public void begin_end() throws Exception{
        //given
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.end(status);

    }
    @Test
    public void begin_exception(){
        //given
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.exception(status, new IllegalStateException());

    }
}