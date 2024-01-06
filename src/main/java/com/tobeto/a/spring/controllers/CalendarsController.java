package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.CalendarService;
import com.tobeto.a.spring.services.dtos.calendar.request.AddCalendarRequest;
import com.tobeto.a.spring.services.dtos.calendar.request.DeleteCalendarRequest;
import com.tobeto.a.spring.services.dtos.calendar.request.UpdateCalendarRequest;
import com.tobeto.a.spring.services.dtos.calendar.response.GetAllCalendarsResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/calendars")
public class CalendarsController {
    private final CalendarService calendarService;
    public CalendarsController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @PostMapping("/add")
    public void add(@RequestBody @Valid AddCalendarRequest request){
        calendarService.add(request);
    }

    @PutMapping("/update")
    public void update (@RequestBody @Valid UpdateCalendarRequest request){
        calendarService.update(request);
    }

    @DeleteMapping("/delete")
    public void delete (@RequestBody DeleteCalendarRequest request){calendarService.delete(request);}

    @GetMapping("/gelAll")
    public List<GetAllCalendarsResponse> getAll(){return calendarService.getAll();}
}
