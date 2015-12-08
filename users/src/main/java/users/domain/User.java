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

    private Address address;

    public User( UserReference reference, String displayName, Address address) {
        this.reference = reference;
        this.displayName = displayName;
        this.address = address;
    }
}
