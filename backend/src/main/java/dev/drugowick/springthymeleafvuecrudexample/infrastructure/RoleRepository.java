package dev.drugowick.springthymeleafvuecrudexample.infrastructure;

import dev.drugowick.springthymeleafvuecrudexample.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
