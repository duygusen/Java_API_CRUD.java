package com.tobeto.a.spring.services.dtos.event.response;

import com.tobeto.a.spring.entities.concretes.Category;
import lombok.Data;

import javax.xml.stream.Location;

@Data
public class GetAllEventsResponse {
    private String eventName;
    private String eventDateTime;
    private Location location;
    private String description;
    private int participantLimit;
    private Category category;
}
