package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.concretes.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {
}
