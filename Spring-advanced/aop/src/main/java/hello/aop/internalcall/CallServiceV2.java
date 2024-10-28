package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallServiceV2 {
    private final ObjectProvider<CallServiceV2>callServiceProvider;

    public CallServiceV2(ObjectProvider<CallServiceV2> callServiceProvider) {
        this.callServiceProvider = callServiceProvider;
    }

    // private final ApplicationContext applicationContext;
    //    public CallServiceV2(ApplicationContext applicationContext) {
    //        this.applicationContext = applicationContext;
    //    }

    public void externalCall(){
        log.info("call externalCall()");
        //CallServiceV2 callServiceV2 = applicationContext.getBean(CallServiceV2.class);
        CallServiceV2 callServiceV2 = callServiceProvider.getObject();
        callServiceV2.internalCall(); // 외부 메서드 실행
    }
    public void internalCall(){
        log.info("call iternalCall()");
    }
}
