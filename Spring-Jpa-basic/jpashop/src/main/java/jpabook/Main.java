package jpabook;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 트랜잭션 시작
        try {
            Order order = new Order();
            // 양방향 매핑관계
            order.addOrderItem(new OrderItem());

            em.persist(order);

            tx.commit(); //db에 저장
        }catch (Exception E){
            tx.rollback(); //예외가 발생하면 롤백
        }finally {
            em.close();
        }
        emf.close();
    }
}