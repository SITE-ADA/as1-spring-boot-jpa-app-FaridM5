package az.edu.ada.adazon.repository;

import az.edu.ada.adazon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
