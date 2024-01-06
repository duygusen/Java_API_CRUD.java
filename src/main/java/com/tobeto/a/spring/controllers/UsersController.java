package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.UserService;
import com.tobeto.a.spring.services.dtos.user.requests.AddUserRequest;
import com.tobeto.a.spring.services.dtos.user.requests.DeleteUserRequest;
import com.tobeto.a.spring.services.dtos.user.requests.UpdateUserRequest;
import com.tobeto.a.spring.services.dtos.user.response.GetAllUsersResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UsersController {
    private final UserService userService;
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public void add(@RequestBody @Valid AddUserRequest request){
        userService.add(request);
    }

    @PutMapping("/update")
    public void update (@RequestBody @Valid UpdateUserRequest request){
        userService.update(request);
    }

    @DeleteMapping("/delete")
    public void delete (@RequestBody DeleteUserRequest request){
        userService.delete(request);
    }

    @GetMapping("/gelAll")
    public List<GetAllUsersResponse> getAll(){return userService.getAll();}
}
