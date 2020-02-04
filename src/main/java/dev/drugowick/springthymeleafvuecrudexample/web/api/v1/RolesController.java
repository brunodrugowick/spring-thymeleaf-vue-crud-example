package dev.drugowick.springthymeleafvuecrudexample.web.api.v1;

import dev.drugowick.springthymeleafvuecrudexample.domain.Role;
import dev.drugowick.springthymeleafvuecrudexample.infrastructure.RoleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RolesController {

    private final RoleRepository roleRepository;

    public RolesController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping("roles")
    public List<Role> list() {
        return roleRepository.findAll();
    }
}
