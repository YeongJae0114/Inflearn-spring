package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallServiceV0 {
    public void externalCall(){
        log.info("call externalCall()");
        internalCall();
    }
    public void internalCall(){
        log.info("call iternalCall()");
    }
}
