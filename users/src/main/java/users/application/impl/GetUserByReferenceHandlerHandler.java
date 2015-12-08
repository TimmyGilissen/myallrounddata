package users.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import users.api.model.UserDTO;
import users.application.GetUserByReferenceHandler;
import users.command.GetUserByReferenceCommand;
import users.domain.User;
import users.mapper.Mapper;
import users.repository.UserRepository;

/**
 * Created by timmygilissen on 8/12/15.
 */
public class GetUserByReferenceHandlerHandler implements GetUserByReferenceHandler {

    @Autowired
    private UserRepository _userRepository;

    @Override
    public UserDTO getUserByReference(GetUserByReferenceCommand getUserByReferenceCommand) {

        User u = _userRepository.findByReference(getUserByReferenceCommand.referenceDTO);

        return Mapper.MapToUserDTO(u);
    }
}
