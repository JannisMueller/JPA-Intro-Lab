package se.Mueller;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAUser");

        EntityManager em1 = emf.createEntityManager();
        em1.getTransaction().begin();
        em1.persist(new User("53603-4238", "janmue", "rest", "Jannis", "Mueller", "test@test.se", "0723068922"));
        em1.getTransaction().commit();

        EntityManager em2 = emf.createEntityManager();
        em2.getTransaction().begin();
        List<User> resultList = em2.createQuery("from User user where user.firstName = :firstName", User.class).setParameter("firstName", "Jannis").getResultList();
        System.out.println(resultList);
        em2.getTransaction().commit();















    }
}
