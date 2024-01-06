package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.core.mappers.ModelMapperService;
import com.tobeto.a.spring.entities.concretes.Calendar;
import com.tobeto.a.spring.repositories.CalendarRepository;
import com.tobeto.a.spring.services.abstracts.CalendarService;
import com.tobeto.a.spring.services.dtos.calendar.request.AddCalendarRequest;
import com.tobeto.a.spring.services.dtos.calendar.request.DeleteCalendarRequest;
import com.tobeto.a.spring.services.dtos.calendar.request.UpdateCalendarRequest;
import com.tobeto.a.spring.services.dtos.calendar.response.GetAllCalendarsResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CalendarManager implements CalendarService {

    private final CalendarRepository calendarRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddCalendarRequest request) {
        Calendar calendar = this.modelMapperService.forRequest().map(request, Calendar.class);
        calendarRepository.save(calendar);
    }

    @Override
    public void delete(DeleteCalendarRequest request) {
        Calendar calendar = this.modelMapperService.forRequest().map(request, Calendar.class);
        calendarRepository.save(calendar);
    }

    @Override
    public void update(UpdateCalendarRequest request) {
        Calendar calendar = this.modelMapperService.forRequest().map(request, Calendar.class);
        calendarRepository.save(calendar);
    }

    @Override
    public List<GetAllCalendarsResponse> getAll() {
        List<Calendar> calendars = calendarRepository.findAll();
        return calendars.stream()
                .map(calendar -> this.modelMapperService.forResponse().map(calendar, GetAllCalendarsResponse.class))
                .toList();
    }
}
