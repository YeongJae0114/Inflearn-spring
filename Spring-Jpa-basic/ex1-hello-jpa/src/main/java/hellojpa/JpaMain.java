package hellojpa;

import jakarta.persistence.*;

import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 트랜잭션 시작
        try {
            Member member = new Member();
            member.setId(1L);
            member.setName("Hello");
            em.persist(member); //Member 객체를 영속 상태로 만든 상태, db 저장은 X

//          Member findMember = em.find(Member.class, 1L);
//          findMember.setName("JPA");
            List<Member> result = em.createQuery("select m from Member as m", Member.class)
                    .getResultList();
            for (Member member1 : result) {
                System.out.println("member1 = " + member1.getName());
            }

            tx.commit(); //db에 저장
        }catch (Exception E){
            tx.rollback(); //예외가 발생하면 롤백
        }finally {
            em.close();
        }
        emf.close();
    }
}
