package springbootstarter.user;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by luisgarcia on 6/22/17.
 */

public interface UserRepo extends CrudRepository<User, Long>
{
}
