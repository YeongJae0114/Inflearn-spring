package jpabook;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jpabook.jpashop.domain.Member;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 트랜잭션 시작
        try {
            Member member = new Member();
            em.persist(member); //Member 객체를 영속 상태로 만든 상태, db 저장은 X


            tx.commit(); //db에 저장
        }catch (Exception E){
            tx.rollback(); //예외가 발생하면 롤백
        }finally {
            em.close();
        }
        emf.close();
    }
}