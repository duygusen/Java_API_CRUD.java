package com.tobeto.a.spring.services.dtos.calendar.request;

import lombok.Data;

import java.util.List;

@Data
public class AddCalendarRequest {

    private String userId;
    private List<String> eventsAttended;
}
