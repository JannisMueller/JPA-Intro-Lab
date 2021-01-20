package se.Mueller;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dbo.Users")
public class User {

    @Id
    private String id;

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;


    public User(String id, String userName, String password, String firstName, String lastName, String email, String phoneNumber) {
    }
}
