package com.tobeto.a.spring.entities.concretes;

import com.tobeto.a.spring.entities.abstracts.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.stream.Location;

@Document(collection="events")
@Data
public class Event extends BaseEntity
{
    private String eventName;
    private String eventDateTime;
    private Location location;
    private String description;
    private int participantLimit;
    private Category category;

}
