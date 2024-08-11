package hello.advanced.app.trace.strategy;

import hello.advanced.app.trace.strategy.code.ContextV1;
import hello.advanced.app.trace.strategy.code.Strategy;
import hello.advanced.app.trace.strategy.code.StrategyLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
@Slf4j
public class ContextV1Test {

    @Test
    void strategyV3(){
        ContextV1 contextV1 = new ContextV1(new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직1 실행");
            }
        });
        contextV1.execute();


        // 로직2
        ContextV1 contextV2 = new ContextV1(new Strategy() {
            @Override
            public void call() {
                log.info("비즈니스 로직2 실행");
            }
        });
        contextV2.execute();
    }

    /**
     * 인터페이스 메서드가 1개만 있을 때 람다식 사용가능
     */
    @Test
    void strategyV4(){
        ContextV1 context1 = new ContextV1(()->log.info("비즈니스 로직1"));
        context1.execute();
        ContextV1 context2 = new ContextV1(()->log.info("비즈니스 로직2"));
        context2.execute();
    }
}
