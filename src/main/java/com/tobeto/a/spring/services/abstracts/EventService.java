package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.event.requests.AddEventRequest;
import com.tobeto.a.spring.services.dtos.event.requests.DeleteEventRequest;
import com.tobeto.a.spring.services.dtos.event.requests.UpdateEventRequest;
import com.tobeto.a.spring.services.dtos.event.response.GetAllEventsResponse;

import java.util.List;

public interface EventService {
    void add(AddEventRequest request);
    void update(UpdateEventRequest request);
    void delete(DeleteEventRequest request);
    List<GetAllEventsResponse> getAll();
}
