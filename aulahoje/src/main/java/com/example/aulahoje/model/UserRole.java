package com.example.aulahoje.model;

public enum UserRole {
    // Configuração para perfil de admin
    ADMIN("admin"),

    // Configuração para perfil de usuário
    USER("user");

    private String regra;

    // Construtor
    UserRole(String regra) {
        this.regra = regra;
    }
    
    // Get
    public String getRegra() {
        return regra;
    }
}
 
 