package com.example.aulahoje.config;

import com.example.aulahoje.model.User;
import com.example.aulahoje.model.UserRole;
import com.example.aulahoje.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

// @Configuration -> indicar para o Spring que esta é uma classe de configuração
@Configuration
public class DataLoader implements CommandLineRunner {

    private final PasswordEncoder senhaEncoder;
    private final UserRepository userRepository;

    public DataLoader(PasswordEncoder senhaEncoder, UserRepository userRepository) {
        this.senhaEncoder = senhaEncoder;
        this.userRepository = userRepository;
    }

    public void run(String... args) throws Exception {
        // Verificar se o usuário ADMIN já existe
        if(userRepository.findByLogin("joao").isEmpty()){
            // Salva o usuário ADMIN no banco
            User admin = new User("joao", "admin123", UserRole.ADMIN);
            userRepository.save(admin);
        }

        // Verificar se o usuário USER já existe
        if(userRepository.findByLogin("felipe").isEmpty()){
            // Salva o usuário USER no banco
            User user = new User("felipe", "user123", UserRole.USER);
            userRepository.save(user);
        }
    }


}
 