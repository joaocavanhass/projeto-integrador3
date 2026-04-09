package com.example.aulahoje.repository;
import com.example.aulahoje.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Criando o método findByLogin
    Optional<User> findByLogin(String login);

}