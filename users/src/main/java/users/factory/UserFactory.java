package users.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import users.factory.DTO.UserDTO;
import users.domain.User;
import users.factory.DTO.UserReferenceDTO;

@Component
public class UserFactory {

    @Autowired
    private UserReferenceFactory userReferenceFactory;

    public User create(UserDTO userDTO) {
        return new User(userReferenceFactory.create(UserReferenceDTO.newBuilder().withReference(userDTO.reference.reference).build())
                , userDTO.displayName
                , userDTO.firstName
                , userDTO.lastName
                , userDTO.street
                , userDTO.number
                , userDTO.postalCode
                , userDTO.city
                , userDTO.country
        );
    }
}

