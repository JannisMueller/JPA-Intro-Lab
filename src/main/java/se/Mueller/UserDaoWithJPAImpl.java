package se.Mueller;

import org.graalvm.compiler.lir.LIRInstruction;

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
        em.persist(new User(id, userName, password, firstName, lastName, email, phoneNumber));
        em.getTransaction().commit();

    }

    @Override
    public List<User> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public List<User> findByLastName(String lastName) {
        return null;
    }

    @Override
    public boolean updatePhoneNumber(String id, String phoneNumber) {
        return false;
    }

    @Override
    public boolean removeUser(String id) {
        return false;
    }
}
