package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.participant.requests.AddParticipantRequest;
import com.tobeto.a.spring.services.dtos.participant.requests.DeleteParticipantRequest;
import com.tobeto.a.spring.services.dtos.participant.requests.UpdateParticipantRequest;
import com.tobeto.a.spring.services.dtos.participant.response.GetAllParticipantsResponse;

import java.util.List;

public interface ParticipantService {
    void add(AddParticipantRequest request);
    void update(UpdateParticipantRequest request);
    void delete(DeleteParticipantRequest request);

    List<GetAllParticipantsResponse> getAll();
}
