package se.Mueller;



public class Main {

    public static void main(String[] args) {


        UserDao userDao = new UserDaoWithJPAImpl();

        userDao.createUser("500603-9838", "janmue", "rest", "Jannis", "TestName", "test@test.se", "0723068922");

        System.out.println(userDao.findByFirstName("Jannis"));
        System.out.println(userDao.findByLastName("Knutson"));
        System.out.println(userDao.updatePhoneNumber("500603-9838", "updatedPhoneNumber"));
        System.out.println(userDao.findByLastName("TestName"));
        System.out.println(userDao.removeUser("500603-9838"));




    }
}
