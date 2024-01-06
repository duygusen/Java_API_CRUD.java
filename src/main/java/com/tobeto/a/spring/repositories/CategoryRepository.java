package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.concretes.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {


}
