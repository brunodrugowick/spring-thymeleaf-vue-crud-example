package dev.drugowick.springthymeleafvuecrudexample.web.pages;

import dev.drugowick.springthymeleafvuecrudexample.infrastructure.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private final UserRepository personRepository;

    public UserController(UserRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/users")
    public String users() {
        return "users";
    }
}
