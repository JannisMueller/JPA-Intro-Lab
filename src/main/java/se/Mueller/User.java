package se.Mueller;


import javax.persistence.*;


@Entity
@Table(name = "Users")
public class User {

   @Id
    @Column(name="ID")
    private String id;

    @Column(name="UserName")
    private String userName;

    @Column(name="Password")
    private String password;

    @Column(name="FirstName")
    private String firstName;

    @Column(name="LastName")
    private String lastName;

    @Column(name="Email")
    private String email;

    @Column(name="Phone")
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "[" + id + "/" +  userName + "/" + password + "/" + firstName + "/" + lastName + "/" + email + "/" + phoneNumber + "/" +"]";
    }

    public User(String id, String userName, String password, String firstName, String lastName, String email, String phoneNumber) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User() {

    }
}
