package springbootstarter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by luisgarcia on 6/22/17.
 */

@RequestMapping("/user")
@Controller
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUser()
    {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id)
    {
        return userService.findUserById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody User user)
    {
         userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Long id)
    {
        userService.updateUser(user, id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id)
    {
        userService.deleteUser(id);
    }

}
