package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.ParticipantService;
import com.tobeto.a.spring.services.dtos.participant.requests.AddParticipantRequest;
import com.tobeto.a.spring.services.dtos.participant.requests.DeleteParticipantRequest;
import com.tobeto.a.spring.services.dtos.participant.requests.UpdateParticipantRequest;
import com.tobeto.a.spring.services.dtos.participant.response.GetAllParticipantsResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/participant")
public class ParticipantsController {

    private final ParticipantService participantService;
    public ParticipantsController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @PostMapping("/add")
    public void add(@RequestBody @Valid AddParticipantRequest request){
        participantService.add(request);
    }

    @PutMapping("/update")
    public void update (@RequestBody @Valid UpdateParticipantRequest request){
        participantService.update(request);
    }

    @DeleteMapping("/delete")
    public void delete (@RequestBody DeleteParticipantRequest request){
        participantService.delete(request);
    }

    @GetMapping
    public List<GetAllParticipantsResponse> getAll(){return participantService.getAll();}
}
