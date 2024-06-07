package com.example.filmoteca.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class RegisterUser {
    private String email;
    private String password;
    private String role;
}
