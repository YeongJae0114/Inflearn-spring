package hello.proxy.psotprocessor;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class BeanPostProcessorTest {
    @Test
    void postProcessor(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanPostProcessorTest.class);

        B b = applicationContext.getBean("beanA", B.class);
        b.helloB();

        Assertions.assertThrows(NoSuchBeanDefinitionException.class, ()-> applicationContext.getBean(BasicTest.B.class));
    }

    static class BeanPostProcessor{
        @Bean(name = "beanA")
        public BasicTest.A a(){
            return new BasicTest.A();
        }
        @Bean(name = "beanB")
        public BasicTest.B b(){
            return new BasicTest.B();
        }
    }
    @Slf4j
    static class A{
        public void helloA(){
            log.info("hello A");
        }
    }

    @Slf4j
    static class B{
        public void helloB(){
            log.info("hello B");
        }
    }
}
