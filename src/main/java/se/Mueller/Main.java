package se.Mueller;



public class Main {

    public static void main(String[] args) {


        UserDao userDao = new UserDaoWithJPAImpl();

        userDao.createUser("500603-9238", "janmue", "rest", "Jannis", "Mueller", "test@test.se", "0723068922");

        System.out.println(userDao.findByFirstName("Jannis"));

        System.out.println(userDao.findByLastName("Knutson"));

        System.out.println(userDao.updatePhoneNumber("500603-4238", "updatedPhoneNumber"));

        System.out.println(userDao.removeUser("500603-8238"));

        System.out.println(userDao.findByFirstName("Jannis"));


    }
}
