package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.core.mappers.ModelMapperService;
import com.tobeto.a.spring.entities.concretes.Event;
import com.tobeto.a.spring.repositories.EventRepository;
import com.tobeto.a.spring.services.abstracts.EventService;
import com.tobeto.a.spring.services.dtos.event.requests.AddEventRequest;
import com.tobeto.a.spring.services.dtos.event.requests.DeleteEventRequest;
import com.tobeto.a.spring.services.dtos.event.requests.UpdateEventRequest;
import com.tobeto.a.spring.services.dtos.event.response.GetAllEventsResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventManager implements EventService {

    private final EventRepository eventRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddEventRequest request) {

        Event event = this.modelMapperService.forRequest().map(request, Event.class);
        eventRepository.save(event);
    }

    @Override
    public void update(UpdateEventRequest request) {

        Event event = this.modelMapperService.forRequest().map(request, Event.class);
        eventRepository.save(event);
    }

    @Override
    public void delete(DeleteEventRequest request){
        Event event = this.modelMapperService.forRequest().map(request, Event.class);
        eventRepository.save(event);
    }

    @Override
    public List<GetAllEventsResponse> getAll() {
        List<Event> events = eventRepository.findAll();
        return events.stream()
                .map(event -> this.modelMapperService.forRequest().map(event, GetAllEventsResponse.class))
                .toList();
    }


}
