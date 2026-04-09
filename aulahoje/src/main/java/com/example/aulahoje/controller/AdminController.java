package com.example.aulahoje.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aulahoje.repository.UserRepository;

// @Controller + @ResponseBody
@RestController
// Configurando Endpoint
@RequestMapping("/admin")
public class AdminController {
    // Agregação
    // essa maneira de instanciar funciona, mas não é o mais profissional/indicado
    // @Autowired
    // private final UserRepository userRepository;

    // Composição
    // Deste segundo jeito, precisamos criar um Contrutor para instaciar esse objeto  
    private final PasswordEncoder senhaEncoder;
    private final UserRepository userRepository;

    public AdminController(PasswordEncoder senhaEncoder, UserRepository userRepository) {
        this.senhaEncoder = senhaEncoder;
        this.userRepository = userRepository;
    }

    // @GetMapping()
    @GetMapping()
    public ResponseEntity <String> adminHome() {
        return ResponseEntity.ok("Bem-Vindo Admin!");
    }

    @GetMapping("/dashboard")
    public ResponseEntity <String> dashboard() {
        return ResponseEntity.ok("Dashboard do Admin");
    }
}
