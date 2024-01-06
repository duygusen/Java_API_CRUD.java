package com.tobeto.a.spring.entities.concretes;

import com.tobeto.a.spring.entities.abstracts.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "calendars")
@Data
public class Calendar extends BaseEntity {
    private String userId;
    private List<String> eventsAttended;
}
