package users.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import users.api.UserReferenceDTO;
import users.api.model.UserDTO;
import users.service.UserService;

@Component
public class GetUserByReferenceCommand {

    @Autowired
    private UserService userService;

    public UserDTO findByReference(final UserReferenceDTO reference){
        return userService.findByReference(reference);
    }
}
