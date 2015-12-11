package users.ext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import users.factory.DTO.UserReferenceDTO;
import users.api.UserRest;
import users.api.request.UserRequestJson;
import users.application.GetAllUsersHandler;
import users.application.GetUserByReferenceHandler;
import users.application.AddUserHandler;
import users.command.GetUserByReferenceCommand;
import users.mapper.Mapper;
import users.api.response.UserResponse;

import java.util.Collection;

@RestController
public class UserRestController implements UserRest {

    @Autowired
    private GetUserByReferenceHandler getUserByReferenceHandler;

    @Autowired
    private GetAllUsersHandler getAllUsersHandler;

    @Autowired
    private AddUserHandler addUserHandler;

    @Override
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public Collection<UserResponse> users() {
        return Mapper.MapToUserResponses(this.getAllUsersHandler.GetAllUsers());
    }

    @Override
    @RequestMapping(value = "/user/{reference}", method = RequestMethod.GET)
    public UserResponse userByReference(@PathVariable("reference") String userReference) {
        return Mapper.MapToUserResponse(getUserByReferenceHandler.getUserByReference(GetUserByReferenceCommand.newBuilder().withReferenceDTO(UserReferenceDTO.newBuilder().withReference(userReference).build()).build()));
    }

    @Override
    @RequestMapping( value = "/user/add" , method = RequestMethod.POST)
    public void addNewUser(@RequestBody UserRequestJson input) {
        addUserHandler.addUser(Mapper.MapToAddUserCommand(input));
    }
}
