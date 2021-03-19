package backend.demo.controller;



import backend.demo.model.Users;
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
    public List<Users> getProfiles(Model model) {
        List<Users> user = userRepository.findAll();
        return user;
    }

    @PostMapping(value = "/insert/user", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Users insertUser(@RequestBody Users user) {
        System.out.println(user);

        return userRepository.save(user);
    }
}
