package hello.advanced.app.v4;

import hello.advanced.app.trace.TraceStatus;
import hello.advanced.app.trace.logtrace.LogTrace;
import hello.advanced.app.trace.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV4 {
    private final OrderRepositoryV4 orderRepository;
    private final LogTrace logTrace;

    public void orderItem(String itemId){
        AbstractTemplate<Void> template = new AbstractTemplate<>(logTrace) {
            @Override
            protected Void call() {
                orderRepository.save(itemId);
                return null;
            }
        };
        template.execute("OrderService.orderItem()");

    }

}
