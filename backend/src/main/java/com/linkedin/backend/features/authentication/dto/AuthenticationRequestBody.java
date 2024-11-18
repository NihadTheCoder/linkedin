package com.linkedin.backend.features.authentication.dto;

import jakarta.validation.constraints.NotBlank;

public class AuthenticationRequestBody {

    @NotBlank(message = "Email must be specified")
    private String email;
    @NotBlank(message = "Password must be specified")
    private String password;

    public AuthenticationRequestBody(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
