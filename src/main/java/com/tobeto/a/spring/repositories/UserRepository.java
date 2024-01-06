package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.concretes.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
