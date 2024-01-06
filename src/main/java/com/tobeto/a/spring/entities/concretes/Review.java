package com.tobeto.a.spring.entities.concretes;

import com.tobeto.a.spring.entities.abstracts.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
public class Review extends BaseEntity {
    private String userId;
    private String eventId;
    private String review;
    private int rating;
    private String reviewDate;
}
