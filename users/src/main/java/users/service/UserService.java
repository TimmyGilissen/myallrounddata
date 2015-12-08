package users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import users.api.model.UserReferenceDTO;
import users.api.model.UserDTO;
import users.repository.UserRepository;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Collection<UserDTO> findAllUsers(){
        return userRepository.findAll();
    }

    public UserDTO findByReference(final UserReferenceDTO reference){
        return userRepository.findByReference(reference);
    }
}
