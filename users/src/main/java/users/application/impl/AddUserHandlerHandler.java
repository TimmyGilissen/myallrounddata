package users.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import users.factory.DTO.UserDTO;
import users.factory.DTO.UserReferenceDTO;
import users.application.AddUserHandler;
import users.command.AddUserCommand;
import users.domain.User;
import users.factory.UserFactory;
import users.repository.UserRepository;

@Component
public class AddUserHandlerHandler implements AddUserHandler {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserFactory userFactory;

    @Override
    public void addUser(AddUserCommand addNewUserCommand) {
        String referenceCode = "ref-" + String.format("%s %s", addNewUserCommand.firstName, addNewUserCommand.lastName).hashCode();

        UserDTO userDTO = UserDTO.newBuilder()
                .withReference(UserReferenceDTO.newBuilder().withReference(referenceCode).build())
                .withDisplayName(addNewUserCommand.firstName + " " + addNewUserCommand.lastName)
                .withFirstName(addNewUserCommand.firstName)
                .withLastName(addNewUserCommand.lastName)
                .withStreet(addNewUserCommand.street)
                .withNumber(addNewUserCommand.number)
                .withCity(addNewUserCommand.city)
                .withPostalCode(addNewUserCommand.postalCode)
                .withCountry(addNewUserCommand.country)
                .build();

        User user = userFactory.create(userDTO);

        userRepository.save(user);
    }
}
