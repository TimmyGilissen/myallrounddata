package users.domain;

import javax.persistence.Embeddable;

/**
 * Created by timmygilissen on 8/12/15.
 */

@Embeddable
public class UserReference {
    private String reference;

    @Override
    public String toString() {
        return "UserReference{" +
                "reference='" + reference + '\'' +
                '}';
    }

    public UserReference(){}

    public UserReference(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }
}
