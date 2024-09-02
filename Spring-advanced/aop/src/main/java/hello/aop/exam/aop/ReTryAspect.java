package hello.aop.exam.aop;

import hello.aop.exam.annotation.ReTry;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
public class ReTryAspect {
    @Around("@annotation(reTry)")
    public Object doRetry(ProceedingJoinPoint joinPoint, ReTry reTry) throws Throwable{
    log.info("[reTry] = {}, retry = {}", joinPoint.getSignature(), reTry);
    Exception exceptionHolder = null;
    int maxValue = reTry.value();
        for (int reTryCount = 1; reTryCount <= maxValue; reTryCount++) {
            try {
                log.info("[reTry] try count={}/{}", reTryCount, maxValue);
                return joinPoint.proceed();
            }catch (Exception e){
                exceptionHolder = e;
            }
        }
        throw exceptionHolder;
    }
}
