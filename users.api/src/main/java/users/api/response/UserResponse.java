package users.api.response;

/**
 * Created by timmygilissen on 9/12/15.
 */
public class UserResponse {

    public  Long id;

    public  String displayName;

    public String referenceCode;

    public UserResponse(Long id, String displayName, String referenceCode) {
        this.id = id;
        this.displayName = displayName;
        this.referenceCode = referenceCode;
    }

    public UserResponse(){

    }
}
