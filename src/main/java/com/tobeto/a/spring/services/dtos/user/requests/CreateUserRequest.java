package com.tobeto.a.spring.services.dtos.user.requests;

import com.tobeto.a.spring.entities.concretes.Role;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data

public class CreateUserRequest {
    private String username;
    private String email;
    private String password;
    private List<Role> roles;
}
