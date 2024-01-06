package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.user.requests.AddUserRequest;
import com.tobeto.a.spring.services.dtos.user.requests.DeleteUserRequest;
import com.tobeto.a.spring.services.dtos.user.requests.UpdateUserRequest;
import com.tobeto.a.spring.services.dtos.user.response.GetAllUsersResponse;

import java.util.List;

public interface UserService {
    void add(AddUserRequest request);
    void update(UpdateUserRequest request);
    void delete(DeleteUserRequest request);
    List<GetAllUsersResponse> getAll();
}
