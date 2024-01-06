package com.tobeto.a.spring.services.dtos.participant.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class AddParticipantRequest {
    private String userId;
    private String eventId;

}
