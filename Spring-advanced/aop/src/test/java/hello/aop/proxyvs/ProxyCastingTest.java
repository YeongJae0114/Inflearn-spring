package hello.aop.proxyvs;

import hello.aop.member.MemberService;
import hello.aop.member.MemberServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProxyCastingTest {
    @Test
    void jdkProxy(){
        MemberServiceImpl target = new MemberServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        proxyFactory.setProxyTargetClass(false); // jdk 동적 프록시

        MemberService memberServiceProxy = (MemberService)proxyFactory.getProxy();
        log.info("proxy class={}", memberServiceProxy.getClass());
        Assertions.assertThrows(ClassCastException.class, ()-> {
            MemberServiceImpl castingMemberService = (MemberServiceImpl)memberServiceProxy;
        });
    }
    @Test
    void cglibProxy(){
        MemberServiceImpl target = new MemberServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        proxyFactory.setProxyTargetClass(true); // cglib 프록시

        MemberService memberServiceProxy = (MemberService)proxyFactory.getProxy();
        log.info("proxy class={}", memberServiceProxy.getClass());

        MemberServiceImpl castingMemberService = (MemberServiceImpl)memberServiceProxy;
    }
}
