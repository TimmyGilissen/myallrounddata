package users.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import users.api.model.UserDTO;
import users.service.UserService;

import java.util.Collection;

@Component
public class FindAllUsersCommand {

    @Autowired
    private UserService userService;

    public Collection<UserDTO> findAllUsers(){
        return userService.findAllUsers();
    }

}
