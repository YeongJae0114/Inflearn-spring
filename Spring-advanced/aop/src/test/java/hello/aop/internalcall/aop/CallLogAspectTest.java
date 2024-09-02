package hello.aop.internalcall.aop;

import hello.aop.internalcall.CallServiceV0;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
@Import(CallLogAspect.class)
class CallLogAspectTest {
    @Autowired
    CallServiceV0 callServiceV0;

    @Test
    public void external() throws Exception{
        //log.info("target={}", callServiceV0.getClass());
        callServiceV0.externalCall();
    }
    @Test
    public void internal() throws Exception{
        callServiceV0.internalCall();
    }
}