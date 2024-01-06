package com.tobeto.a.spring.services.dtos.user.response;

import lombok.Data;
import org.springframework.context.annotation.Profile;

@Data
public class GetAllUsersResponse {
    private String username;
    private String email;
    private String password;
    private Profile profile;
}
