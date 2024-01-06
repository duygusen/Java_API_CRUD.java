package com.tobeto.a.spring.services.dtos.participant.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateParticipantRequest {
    private  String id;

    private String userId;
    private String eventId;

}
