package users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import users.domain.User;
import users.domain.UserReference;

/**
 * Created by timmygilissen on 26/07/15.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByReference(UserReference reference);

}
