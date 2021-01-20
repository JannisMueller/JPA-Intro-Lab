package se.Mueller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestMain {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("JPADemo"); //only once!


        EntityManager em = emf.createEntityManager();    //for each "unit of work"


    }
}
