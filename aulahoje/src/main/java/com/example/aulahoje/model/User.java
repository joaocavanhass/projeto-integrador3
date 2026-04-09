package com.example.aulahoje.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// define que esta classe é uma entidade de BD
@Entity
// define um nome para esta entidade dentro do BD
@Table(name = "users")
public class User {
    // marca o campo ID como chave primária
    @Id
    // método de geração do auto increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Login
    private String login;
    // Senha
    private String senha;

    // Tipo de perfil do usuario: ADMIN ou USER
    // @Enumerated(EnumType.STRING) --> converte o Enum em String "admin" ou "user"
    @Enumerated(EnumType.STRING)
    private UserRole regra;

    // Construtor -> Vazio para JPA 
    public User(){}

    public User(String login, String senha, UserRole regra) {
        this.login = login;
        this.senha = senha;
        this.regra = regra;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UserRole getRegra() {
        return regra;
    }

    public void setRegra(UserRole regra) {
        this.regra = regra;
    }

    // Métodos para Atenticação do Usuário
    public Collection <? extends GrantedAuthority> getAuthorities() {
        if (this.regra == UserRole.ADMIN) {
            return List.of(
                new SimpleGrantedAuthority("ROLE_ADMIN"),
                new SimpleGrantedAuthority("ROLE_USER")
            );
        }
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    // Exemplos de Métodos - Sessão no site
    public boolean isContaExpirada() {
        return true;
    }

    public boolean isContaBloqueada() {
        return true;
    }
 }
