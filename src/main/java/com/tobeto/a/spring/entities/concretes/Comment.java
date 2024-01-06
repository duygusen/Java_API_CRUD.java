package com.tobeto.a.spring.entities.concretes;

import com.tobeto.a.spring.entities.abstracts.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "comments")
public class Comment extends BaseEntity {

    private String userId;
    private String eventId;
    private String comment;
    private String commentDate;

}
