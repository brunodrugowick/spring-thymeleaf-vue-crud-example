package dev.drugowick.springthymeleafvuecrudexample.web.pages;

import dev.drugowick.springthymeleafvuecrudexample.infrastructure.RoleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoleController {

    private final RoleRepository roleRepository;

    public RoleController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping("/roles")
    public String rolesPage() {
        return "roles";
    }
}
