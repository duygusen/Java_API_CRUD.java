package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.concretes.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String>
{

}
