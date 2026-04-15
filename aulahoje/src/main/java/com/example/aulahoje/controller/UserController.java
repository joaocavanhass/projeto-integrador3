package com.example.aulahoje.controller;

import com.example.aulahoje.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
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







}
 