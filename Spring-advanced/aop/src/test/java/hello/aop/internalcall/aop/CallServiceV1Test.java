package hello.aop.internalcall.aop;


import hello.aop.internalcall.CallServiceV1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(CallLogAspect.class)
class CallServiceV1Test {
    @Autowired
    CallServiceV1 callServiceV1;

    @Test
    void external(){
        callServiceV1.externalCall();
    }
}