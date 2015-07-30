package users.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import users.api.model.User;

import java.util.Collection;

public interface UserRest {

    @RequestMapping("/users")
    Collection<User> users();

    @RequestMapping("/user/{reference}")
    User userByReference(@PathVariable("reference") UserReference userReference);
}
