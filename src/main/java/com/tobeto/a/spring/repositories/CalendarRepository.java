package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.concretes.Calendar;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CalendarRepository extends MongoRepository<Calendar, String> {
}
