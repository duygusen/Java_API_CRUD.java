package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.concretes.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
}
