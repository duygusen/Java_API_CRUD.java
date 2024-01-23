package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.user.requests.*;
import com.tobeto.a.spring.services.dtos.user.response.GetAllUsersResponse;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    void add(AddUserRequest request);
    void update(UpdateUserRequest request);
    void delete(DeleteUserRequest request);
    List<GetAllUsersResponse> getAll();

    void register(CreateUserRequest request);
    String login(LoginRequest request);
}
