package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.concretes.Participant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipantRepository extends MongoRepository<Participant, String> {
}
