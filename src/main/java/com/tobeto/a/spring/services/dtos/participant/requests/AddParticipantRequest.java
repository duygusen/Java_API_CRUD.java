package com.tobeto.a.spring.services.dtos.participant.requests;

import lombok.Data;

@Data
public class AddParticipantRequest {
    private String userId;
    private String eventId;

}
