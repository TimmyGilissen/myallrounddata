package users.ext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import users.api.UserReference;
import users.api.UserRest;
import users.api.model.User;
import users.command.FindAllUsersCommand;
import users.command.GetUserByReferenceCommand;

import java.util.Collection;

@RestController
public class UserRestController implements UserRest {

    @Autowired
    private FindAllUsersCommand findAllUsersCommand;

    @Autowired
    private GetUserByReferenceCommand getUserByReferenceCommand;

    @Override
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public Collection<User> users() {
        return this.findAllUsersCommand.findAllUsers();
    }

    @Override
    @RequestMapping(value = "/user/{reference}", method = RequestMethod.GET)
    public User userByReference(@PathVariable("reference") UserReference userReference) {
        return this.getUserByReferenceCommand.findByReference(userReference);
    }
}
