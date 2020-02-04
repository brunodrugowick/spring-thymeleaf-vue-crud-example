package dev.drugowick.springthymeleafvuecrudexample.web.api.v1;

import dev.drugowick.springthymeleafvuecrudexample.domain.User;
import dev.drugowick.springthymeleafvuecrudexample.infrastructure.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsersController {

    private final UserRepository userRepository;

    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> list() {
        return userRepository.findAll();
    }
}
