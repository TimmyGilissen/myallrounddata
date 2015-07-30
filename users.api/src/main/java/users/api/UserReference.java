package users.api;

import javax.persistence.Embeddable;

@Embeddable
public class UserReference {

    private String reference;

    public UserReference(){

    }

    public UserReference(final String reference){
        this.reference = reference;
    }


    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString(){
        return reference;
    }
}
