package hello.advanced.app.trace.logtrace;

import hello.advanced.app.trace.TraceStatus;

public interface LogTrace {
    //  begin
    TraceStatus begin(String message);
    // end
    void end(TraceStatus status);
    // exception
    void exception(TraceStatus status, Exception e);
}
