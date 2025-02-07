package tn.esprit.kubemigrator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.kubemigrator.entities.Role;
import tn.esprit.kubemigrator.entities.User;

import java.util.List;
import java.util.Optional;

public interface RepUser extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    User findUserByEmail(String email);

    List<User> findByRole(Role role);

}
