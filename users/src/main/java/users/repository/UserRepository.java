package users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import users.api.model.UserReferenceDTO;
import users.domain.User;

/**
 * Created by timmygilissen on 26/07/15.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByReference(UserReferenceDTO reference);

}
