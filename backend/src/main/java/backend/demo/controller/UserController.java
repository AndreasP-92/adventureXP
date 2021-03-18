package backend.demo.controller;


import backend.demo.model.Profile;
import backend.demo.model.User;
import backend.demo.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getProfiles(Model model) {
        List<User> user = userRepository.findAll();
        return user;
    }

    @PostMapping(value = "/insert/user", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public User insertUser(@RequestBody User user) {
        System.out.println(user);

        return userRepository.save(user);
    }
}
