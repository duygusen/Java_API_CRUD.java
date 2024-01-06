package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.calendar.request.AddCalendarRequest;
import com.tobeto.a.spring.services.dtos.calendar.request.DeleteCalendarRequest;
import com.tobeto.a.spring.services.dtos.calendar.request.UpdateCalendarRequest;
import com.tobeto.a.spring.services.dtos.calendar.response.GetAllCalendarsResponse;

import java.util.List;

public interface CalendarService {
    void add(AddCalendarRequest request);
    void delete(DeleteCalendarRequest request);
    void update(UpdateCalendarRequest request);
    List<GetAllCalendarsResponse> getAll();
}
