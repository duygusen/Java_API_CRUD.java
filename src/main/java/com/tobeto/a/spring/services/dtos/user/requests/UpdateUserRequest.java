package com.tobeto.a.spring.services.dtos.user.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.context.annotation.Profile;

@Data
public class UpdateUserRequest {
    private  String id;

    private String username;
    private String email;
    private String password;
    private Profile profile;
}
