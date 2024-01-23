package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.core.mappers.ModelMapperService;
import com.tobeto.a.spring.core.services.JwtService;
import com.tobeto.a.spring.entities.concretes.User;
import com.tobeto.a.spring.repositories.UserRepository;
import com.tobeto.a.spring.services.abstracts.UserService;
import com.tobeto.a.spring.services.dtos.user.requests.*;
import com.tobeto.a.spring.services.dtos.user.response.GetAllUsersResponse;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserManager implements UserService {

    private final UserRepository userRepository;
    private final ModelMapperService modelMapperService;
    private final PasswordEncoder passwordEncoder;


    @Override
    public void register(CreateUserRequest createUserRequest) {
        User user = User.builder()
                .username(createUserRequest.getUsername())
                .email(createUserRequest.getEmail())
                .authorities(createUserRequest.getRoles())
                .password(passwordEncoder.encode(createUserRequest.getPassword()))
                .build();
        userRepository.save(user);
    }

    @Override
    public String login(LoginRequest request) {
        return "";
    }

    @Override
    public void add(AddUserRequest request) {

        User user = this.modelMapperService.forRequest().map(request, User.class);
        userRepository.save(user);
    }

    @Override
    public void update(UpdateUserRequest request) {
        User user = this.modelMapperService.forRequest().map(request, User.class);
        userRepository.save(user);
    }

    @Override
    public void delete(DeleteUserRequest request) {
        User user = this.modelMapperService.forRequest().map(request, User.class);
        userRepository.save(user);
    }

    @Override
    public List<GetAllUsersResponse> getAll() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> this.modelMapperService.forRequest().map(user, GetAllUsersResponse.class))
                .toList();
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("No user found"));
    }


}
