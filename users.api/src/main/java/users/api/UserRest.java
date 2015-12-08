package users.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import users.api.model.UserDTO;

import java.util.Collection;

public interface UserRest {

    @RequestMapping("/users")
    Collection<UserDTO> users();

    @RequestMapping("/user/{reference}")
    UserDTO userByReference(@PathVariable("reference") UserReferenceDTO userReferenceDTO);
}
