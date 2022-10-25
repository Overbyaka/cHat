package ru.grishkova.cHat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.grishkova.cHat.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);
}
