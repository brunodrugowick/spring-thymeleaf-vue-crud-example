package dev.drugowick.springthymeleafvuecrudexample.web.api.v1;

import dev.drugowick.springthymeleafvuecrudexample.domain.Role;
import dev.drugowick.springthymeleafvuecrudexample.domain.User;
import dev.drugowick.springthymeleafvuecrudexample.infrastructure.RoleRepository;
import dev.drugowick.springthymeleafvuecrudexample.infrastructure.UserRepository;
import dev.drugowick.springthymeleafvuecrudexample.web.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UsersController {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UsersController(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @GetMapping("/users")
    public List<User> list() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User save(@RequestBody @NotNull UserDto userDto) {
        Optional<Role> role = roleRepository.findById(userDto.getRoleId());

        if (role.isPresent()) {
            User user = new User();
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());
            user.setRole(role.get());

            return userRepository.save(user);
        }

        return null;
    }
}
