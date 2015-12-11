package users.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by timmygilissen on 8/12/15.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private UserReference reference;

    private String displayName;

    private String firstName;

    private String lastName;

    private String street;

    private int number;

    private int postalCode;

    private String city;

    private String country;

    public User() {
    }

    public User(UserReference reference, String displayName, String firstName, String lastName, String street, int number, int postalCode, String city, String country) {
        this.reference = reference;
        this.displayName = displayName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public User(UserReference userReference, String displayName) {
        this.reference = userReference;
        this.displayName = displayName;
    }

    public Long getId() {
        return id;
    }

    public UserReference getReference() {
        return reference;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
