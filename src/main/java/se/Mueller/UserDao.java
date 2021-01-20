package se.Mueller;

import java.util.List;

public interface UserDao {

    /**
     * Creates a new User
     *
     * @param id The Id is the personal id-number for swedish residence; will not be generated automatically!
     * @param userName the user name must be a combination of first 3 letters and last name
     * for example Johanna Lennartsson -> johlen
     * @param password password of the user
     * @param firstName first name of the user
     * @param lastName last name of the user
     * @param email email of the user
     * @param phoneNumber phone number of the user
     *
     */
    void createUser(String id, String userName, String password, String firstName, String lastName, String email, String phoneNumber);

    /**
     * finds user by the first name
     * @param firstName
     *
     * @return list with all user with exact firstName
     */
    List<User> findByFirstName(String firstName);

    /** finds user by the last name
     *
     * @param lastName
     * @return list with all user with exact firstName
     */
    List<User> findByLastName(String lastName);

    /**
     * finds user by id and updates phone number of user
     *
     * @param id personal id-number for swedish residence
     * @param phoneNumber phone number for the update
     * @return success, failure of the update
     */
    boolean updatePhoneNumber(String id, String phoneNumber);

    /**
     * removes user
     *
     * @param id personal id-number for swedish residence
     * @return success, failure of the removal
     */
    boolean removeUser (String id);


}
