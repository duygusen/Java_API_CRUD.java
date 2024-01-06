package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.EventService;
import com.tobeto.a.spring.services.dtos.event.requests.AddEventRequest;
import com.tobeto.a.spring.services.dtos.event.requests.DeleteEventRequest;
import com.tobeto.a.spring.services.dtos.event.requests.UpdateEventRequest;
import com.tobeto.a.spring.services.dtos.event.response.GetAllEventsResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/events")
public class EventsController
{
    private EventService eventService;
    public EventsController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/add")
    public void add(@RequestBody @Valid AddEventRequest request){
        eventService.add(request);
    }

    @PutMapping("/update")
    public void update (@RequestBody @Valid UpdateEventRequest request){
        eventService.update(request);
    }

    @DeleteMapping("/delete")
    public void delete (@RequestBody DeleteEventRequest request){
        eventService.delete(request);
    }

    @GetMapping("/getAll")
    public List<GetAllEventsResponse> getAll(){return eventService.getAll();}

}
