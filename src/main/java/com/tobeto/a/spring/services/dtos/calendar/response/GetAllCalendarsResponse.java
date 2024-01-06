package com.tobeto.a.spring.services.dtos.calendar.response;

import lombok.Data;

import java.util.List;

@Data
public class GetAllCalendarsResponse {
    private String userId;
    private List<String> eventsAttended;
}
