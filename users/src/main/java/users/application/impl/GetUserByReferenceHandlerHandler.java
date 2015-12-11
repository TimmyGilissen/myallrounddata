package users.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import users.factory.DTO.UserDTO;
import users.application.GetUserByReferenceHandler;
import users.command.GetUserByReferenceCommand;
import users.domain.User;
import users.domain.UserReference;
import users.factory.UserReferenceFactory;
import users.mapper.Mapper;
import users.repository.UserRepository;

@Component
public class GetUserByReferenceHandlerHandler implements GetUserByReferenceHandler {

    @Autowired
    private UserRepository _userRepository;

    @Autowired
    private UserReferenceFactory userReferenceFactory;

    @Override
    public UserDTO getUserByReference(GetUserByReferenceCommand getUserByReferenceCommand) {

        UserReference reference = userReferenceFactory.create(getUserByReferenceCommand.referenceDTO);

        User u = _userRepository.findByReference(reference);

        return Mapper.MapToUserDTO(u);
    }
}
