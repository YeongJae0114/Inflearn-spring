package hello.proxy.config.v2_dynamicProxy.handler;

import hello.proxy.trace.TraceStatus;
import hello.proxy.trace.logtrace.LogTrace;
import org.springframework.util.PatternMatchUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogTraceFilterHandler implements InvocationHandler {
    private final LogTrace logTrace;
    private final Object target;
    private final String[] patterns;

    public LogTraceFilterHandler(Object target, LogTrace logTrace, String[] patterns) {
        this.logTrace = logTrace;
        this.target = target;
        this.patterns = patterns;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if(!PatternMatchUtils.simpleMatch(patterns, methodName)){
            return method.invoke(target, args);
        }

        TraceStatus status = null;
        try {
            String message = method.getDeclaringClass().getSimpleName() + "." + method.getName() + "()";
            status = logTrace.begin(message);
            // 실제 로직 호출
            Object result = method.invoke(target, args);
            logTrace.end(status);
            return result;
        }catch (Exception e){
            logTrace.exception(status, e);
            throw e;
        }
    }
}
