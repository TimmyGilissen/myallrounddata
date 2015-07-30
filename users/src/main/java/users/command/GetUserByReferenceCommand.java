package users.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import users.api.UserReference;
import users.api.model.User;
import users.service.UserService;

@Component
public class GetUserByReferenceCommand {

    @Autowired
    private UserService userService;

    public User findByReference(final UserReference reference){
        return userService.findByReference(reference);
    }
}
