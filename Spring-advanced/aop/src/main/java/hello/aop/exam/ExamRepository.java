package hello.aop.exam;

import hello.aop.exam.annotation.ReTry;
import hello.aop.exam.annotation.Trace;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class ExamRepository {
    static int seq = 0;
    @Trace
    @ReTry(4)
    public void save(String itemId){
        seq++;
        if(seq % 5==0){
            throw new IllegalStateException("5번 실패");
        }
    }
}
