package users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import users.api.UserReferenceDTO;
import users.api.model.UserDTO;

/**
 * Created by timmygilissen on 26/07/15.
 */
public interface UserRepository extends JpaRepository<UserDTO,Long> {

    UserDTO findByReference(UserReferenceDTO reference);

}
