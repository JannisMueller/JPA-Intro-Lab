package se.Mueller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserDaoWithJPAImpl implements UserDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAUser");

    @Override
    public void createUser(String id, String userName, String password, String firstName, String lastName, String email, String phoneNumber) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(new User(id,userName,password,firstName,lastName,email,phoneNumber));
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<User> findByFirstName(String firstName) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<User> resultList = em.createQuery("from User user where user.firstName = :firstName", User.class).setParameter("firstName", firstName).getResultList();

        em.getTransaction().commit();
        em.close();
        return resultList;

    }

    @Override
    public List<User> findByLastName(String lastName) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<User> resultList = em.createQuery("from User user where user.lastName = :lastName", User.class).setParameter("lastName", lastName).getResultList();

        em.getTransaction().commit();
        em.close();
        return resultList;
    }

    @Override
    public boolean updatePhoneNumber(String id, String phoneNumber) {
        boolean success =  false;

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        if(user != null){
            user.setPhoneNumber(phoneNumber);
            success = true;
            em.getTransaction().commit();
        }
        em.close();
        return success;
    }

    @Override
    public boolean removeUser(String id) {

        boolean success =  false;

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        if(user != null){
            em.remove(user);
            success = true;
            em.getTransaction().commit();
        }
        em.close();
        return success;
    }
}
