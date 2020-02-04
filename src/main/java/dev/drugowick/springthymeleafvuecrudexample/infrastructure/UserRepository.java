package dev.drugowick.springthymeleafvuecrudexample.infrastructure;

import dev.drugowick.springthymeleafvuecrudexample.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
