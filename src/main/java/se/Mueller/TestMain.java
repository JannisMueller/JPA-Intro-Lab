package se.Mueller;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAUser");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(new User("51675-9238", "janmue", "rest", "Jannis", "Mueller", "test@test.se", "0723068922"));
        em.getTransaction().commit();


        em.getTransaction().begin();
        List<User> resultList = em.createQuery("from User user where user.firstName = :firstName", User.class).setParameter("firstName", "Jannis").getResultList();
        System.out.println(resultList);
        em.getTransaction().commit();

        em.getTransaction().begin();
        User user = em.find(User.class, "51675-9238");
        if(user != null){
            user.setPhoneNumber("0727328999");
            em.getTransaction().commit();
            System.out.println("User updated");
        } else {
            System.out.println("couldnt find user");
        }

        em.getTransaction().begin();
        user = em.find(User.class,"51675-9238" );
        if(user != null){
            em.remove(user);
            em.getTransaction().commit();
            System.out.println("User removed");
        } else {
            System.out.println("couldnt find user");
        }



        em.close();
        emf.close();















    }
}
