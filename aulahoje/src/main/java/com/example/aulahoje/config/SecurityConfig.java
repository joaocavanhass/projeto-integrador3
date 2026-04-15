package com.example.aulahoje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
// Ativando a segurança Web - Spring Security
@EnableWebSecurity
public class SecurityConfig {
    
    // Registrar o SecurityFilterChain como um objeto que precisa ser carregado 
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        Customizer<HttpBasicConfigurer<HttpSecurity>> widthDefault = null;
        // Configuração de habilitar/Desabilitar ataques por sites de 3ºs
        http.csrf( csrf -> csrf.disable())
        
        .headers(headers -> headers.frameOptions(frame -> frame.disable()))
        // Define as regras de autorização para cada rota        
        .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console").permitAll()
                // Apenas usuários com Regras de Admin podem acessar /admin/**
                .requestMatchers("/admin/**").hasRole("ADMIN")
                // Apenas usuários com Regras de Usuário podem acessar /user/**
                .requestMatchers("/user/**").hasRole("USER")
                //Qualquer outra rota exige que o usuário esteja autenticado.
                .anyRequest().authenticated()
    )
        .httpBasic(widthDefault);
        
        return http.build();
    }
    
}
 