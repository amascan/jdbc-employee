package dao;

/**
 * Created by Adrian on 11.11.2016.
 */
public class User {
    String lastName;
    String firstName;
    String email;
    Double venit;

    public User(String lastName, String firstName, String email, Double venit) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.venit = venit;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getVenit() {
        return venit;
    }

    public void setVenit(Double venit) {
        this.venit = venit;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", venit=" + venit +
                '}';
    }
}
