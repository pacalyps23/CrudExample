package springbootstarter.user;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by luisgarcia on 6/22/17.
 */

@Service
public class UserService
{
    @Autowired
    private UserRepo userRepo;
    private static final AtomicInteger counter = new AtomicInteger();
    private List<User> users = new ArrayList<>(
            Arrays.asList(
                    new User(counter.incrementAndGet(), "Paco", "Garcia",
                            "301 N Broom Street", "Wilmington", "DE", 19806)
            ));


    public List<User> getAllUsers()
    {
        return (List<User>) userRepo.findAll();
    }

    public User findUserById(Long id)
    {
        return userRepo.findOne(id);
    }

    public void addUser(User user)
    {
        userRepo.save(user);
    }

    public void updateUser(User user, Long id)
    {
        userRepo.save(user);
    }

    public void deleteUser(Long id)
    {
        userRepo.delete(id);
    }

}
