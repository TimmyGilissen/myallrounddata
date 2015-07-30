package users.api.model;


import users.api.UserReference;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private UserReference reference;

    private String displayName;

    public User(){}

    public User(UserReference reference, String displayName){
        this.reference = reference;
        this.displayName = displayName;
    }

    public Long getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public UserReference getReference() {
        return reference;
    }

    @Override
    public String toString(){
        return "User {" +
                "id=" + id +
                ", displayName='" + displayName +'\'' + "}";
    }
}
