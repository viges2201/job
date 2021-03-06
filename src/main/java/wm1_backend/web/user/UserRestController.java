package wm1_backend.web.user;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import wm1_backend.model.User;
import wm1_backend.service.UserService;

import java.util.List;

@Controller
public class UserRestController {
    private final UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    public List<User> getAll() {
        return userService.getAll();
    }

    public void create(User user) {
        userService.create(user);
    }

    public void update(User user) {
        userService.update(user);
    }

    public void delete(int id) {
        userService.delete(id);
    }

    public User getById(int id) {
        return userService.get(id);
    }

    public List<User> getFilterList(int amountOfInvestment, int amountOfRisk) {
        return userService.getFilterList(amountOfInvestment, amountOfRisk);
    }
}
