package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.core.mappers.ModelMapperService;
import com.tobeto.a.spring.entities.concretes.Participant;
import com.tobeto.a.spring.entities.concretes.User;
import com.tobeto.a.spring.repositories.UserRepository;
import com.tobeto.a.spring.services.abstracts.UserService;
import com.tobeto.a.spring.services.dtos.participant.response.GetAllParticipantsResponse;
import com.tobeto.a.spring.services.dtos.user.requests.AddUserRequest;
import com.tobeto.a.spring.services.dtos.user.requests.DeleteUserRequest;
import com.tobeto.a.spring.services.dtos.user.requests.UpdateUserRequest;
import com.tobeto.a.spring.services.dtos.user.response.GetAllUsersResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserManager implements UserService {

    private final UserRepository userRepository;
    private final ModelMapperService modelMapperService;
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
}
