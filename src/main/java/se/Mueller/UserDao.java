package se.Mueller;

import java.util.List;

public interface UserDao {

    /**
     * Creates a new User
     * @param id The Id is the personal id-number for swedish residence; will not be generated automatically!
     * @param userName the user name must be a combination of first 3 letters and last name
     * for example Johanna Lennartsson -> johlen
     */
    void createUser(String id, String userName, String password, String firstName, String lastName, String email, String phoneNumber);

    /**
     * finds user by the first name
     * @return list with all user with exact firstName
     */
    List<User> findByFirstName(String firstName);

    /** finds user by the last name
     *
     * @return list with all user with exact lastName
     */
    List<User> findByLastName(String lastName);

    /**
     * finds user by id and updates phone number of user
     * @return success, failure of the update
     */
    boolean updatePhoneNumber(String id, String phoneNumber);

    /**
     * removes user
     * @return success, failure of the removal
     */
    boolean removeUser (String id);


}
