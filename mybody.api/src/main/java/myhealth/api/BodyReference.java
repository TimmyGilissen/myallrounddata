package myhealth.api;

/**
 * Created by timmygilissen on 4/12/15.
 */
public class BodyReference {

    public BodyReference(){}

    public BodyReference(String reference){
        this.reference = reference;
    }

    private String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
