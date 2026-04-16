package com.example.aulahoje.controller;

import com.example.aulahoje.controller.dto.UserDTO;
import com.example.aulahoje.model.User;
import com.example.aulahoje.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final PasswordEncoder senhaEncoder;
    private final UserRepository userRepository;

    public UserController(PasswordEncoder senhaEncoder, UserRepository userRepository) {
        this.senhaEncoder = senhaEncoder;
        this.userRepository = userRepository;
    }

    @GetMapping()
    public ResponseEntity<Void> userHome() {
        return ResponseEntity.status(302)
                .location(java.net.URI.create("user/profile"))
                .build();
    }

    @GetMapping("/profile")
    public ResponseEntity<String> perfil(Authentication authentication) {
        return ResponseEntity.ok("Olá " + authentication.getName());
    }


    @PostMapping("/usuarios")
    public ResponseEntity<String> adicionarUsuario(@RequestBody UserDTO dto) {
         if (userRepository.findByLogin(dto.login()).isPresent()) {
             return ResponseEntity.status(409).body("Login já existe"); 
         }
        User novoUsuario = new User(dto.login(), senhaEncoder.encode(dto.senha()), dto.role());
        userRepository.save(novoUsuario);
        
        return ResponseEntity.status(201).body("Usuário criado com sucesso");
      }
}
 