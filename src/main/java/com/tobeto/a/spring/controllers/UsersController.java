package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.core.services.JwtService;
import com.tobeto.a.spring.services.abstracts.UserService;
import com.tobeto.a.spring.services.dtos.user.requests.*;
import com.tobeto.a.spring.services.dtos.user.response.GetAllUsersResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;

import java.util.List;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UsersController {

    private final UserService userService;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody CreateUserRequest request){userService.register(request);}

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody LoginRequest request){

        // TODO: Auth Service'e taşınmalı
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        if(authentication.isAuthenticated())
        {
            return jwtService.generateToken(request.getUsername());
        }

        throw new RuntimeException("Kullanıcı adı ya da şifre yanlış");
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
