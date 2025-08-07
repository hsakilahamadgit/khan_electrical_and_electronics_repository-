package khan_electrical_and_electronics.electrical_electronics_service_app.repository;

import khan_electrical_and_electronics.electrical_electronics_service_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
   Optional<User> findByEmail(String email);


    // Additional query methods can be defined here if needed
}
