package com.example.aulahoje.controller.dto;

import com.example.aulahoje.model.UserRole;

public record UserDTO(String login, String senha, UserRole role) {
    
} 

