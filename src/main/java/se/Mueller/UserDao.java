package se.Mueller;

import java.util.List;

public interface UserDao {


    void createUser(String id, String userName, String password, String firstName, String lastName, String email, String phoneNumber);
    //Creates a new User; id: The Id is the personal id-number for swedish residence; will not be generated automatically!
    //UserName must be a combination of first 3 letters and last name: for example Johanna Lennartsson -> johlen

    List<User> findByFirstName(String firstName);
    //finds user by the first name; returns list with all user with exact firstName

    List<User> findByLastName(String lastName);
    //finds user by the last name; returns list with all user with exact lastName

    boolean updatePhoneNumber(String id, String phoneNumber);
    //finds user by id and updates phone number of user; return success, failure of the update

    boolean removeUser (String id);
    //removes user; returns success, failure of the update


}
