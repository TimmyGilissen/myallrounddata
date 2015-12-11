package users.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import users.api.request.UserRequestJson;
import users.api.response.UserResponse;

import java.util.Collection;

public interface UserRest {

    @RequestMapping("/users")
    Collection<UserResponse> users();

    @RequestMapping("/user/{reference}")
    UserResponse userByReference(@PathVariable("reference") String userReference);

    @RequestMapping( value = "/user/add" , method = RequestMethod.POST)
    void addNewUser(@RequestBody UserRequestJson input);
}
