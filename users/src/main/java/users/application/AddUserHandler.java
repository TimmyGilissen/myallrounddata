package users.application;

import org.springframework.stereotype.Component;
import users.command.AddUserCommand;

@Component
public interface AddUserHandler {

    void addUser(AddUserCommand addNewUserCommand);

}
