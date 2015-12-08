package users.ext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import users.api.model.UserReferenceDTO;
import users.api.UserRest;
import users.api.model.UserDTO;
import users.application.GetAllUsersHandler;
import users.application.GetUserByReferenceHandler;
import users.command.GetUserByReferenceCommand;

import java.util.Collection;

@RestController
public class UserRestController implements UserRest {

    @Autowired
    private GetUserByReferenceHandler getUserByReferenceHandler;

    @Autowired
    private GetAllUsersHandler getAllUsersHandler;

    @Override
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public Collection<UserDTO> users() {
        return this.getAllUsersHandler.GetAllUsers();
    }

    @Override
    @RequestMapping(value = "/user/{reference}", method = RequestMethod.GET)
    public UserDTO userByReference(@PathVariable("reference") UserReferenceDTO userReferenceDTO) {
        return getUserByReferenceHandler.getUserByReference(GetUserByReferenceCommand.newBuilder().withReferenceDTO(userReferenceDTO).build());
    }
}
