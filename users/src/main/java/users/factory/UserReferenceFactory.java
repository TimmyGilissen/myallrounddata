package users.factory;

import org.springframework.stereotype.Component;
import users.factory.DTO.UserReferenceDTO;
import users.domain.UserReference;


@Component
public class UserReferenceFactory {

    public UserReference create(UserReferenceDTO referenceDTO) {
        return new UserReference(referenceDTO.reference);
    }
}
