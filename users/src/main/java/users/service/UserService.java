package users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import users.api.UserReference;
import users.api.model.User;
import users.repository.UserRepository;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Collection<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findByReference(final UserReference reference){
        return userRepository.findByReference(reference);
    }
}
