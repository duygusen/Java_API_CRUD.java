package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.core.mappers.ModelMapperService;
import com.tobeto.a.spring.entities.concretes.Participant;
import com.tobeto.a.spring.repositories.ParticipantRepository;
import com.tobeto.a.spring.services.abstracts.ParticipantService;
import com.tobeto.a.spring.services.dtos.participant.requests.AddParticipantRequest;
import com.tobeto.a.spring.services.dtos.participant.requests.DeleteParticipantRequest;
import com.tobeto.a.spring.services.dtos.participant.requests.UpdateParticipantRequest;
import com.tobeto.a.spring.services.dtos.participant.response.GetAllParticipantsResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ParticipantManager implements ParticipantService {

    private final ParticipantRepository participantRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddParticipantRequest request) {

        Participant participant = this.modelMapperService.forRequest().map(request, Participant.class);
        participantRepository.save(participant);
    }

    @Override
    public void update(UpdateParticipantRequest request) {
        Participant participant = this.modelMapperService.forRequest().map(request, Participant.class);
        participantRepository.save(participant);
    }

    @Override
    public void delete(DeleteParticipantRequest request) {
        Participant participant = this.modelMapperService.forRequest().map(request, Participant.class);
        participantRepository.save(participant);
    }

    @Override
    public List<GetAllParticipantsResponse> getAll() {
       List<Participant> participants = participantRepository.findAll();
        return participants.stream()
                .map(participant -> this.modelMapperService.forRequest().map(participant, GetAllParticipantsResponse.class))
                .toList();
    }


}
