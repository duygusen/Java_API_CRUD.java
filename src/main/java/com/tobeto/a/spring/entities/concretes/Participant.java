package com.tobeto.a.spring.entities.concretes;

import com.tobeto.a.spring.entities.abstracts.BaseEntity;
import com.tobeto.a.spring.entities.concretes.Category;
import com.tobeto.a.spring.entities.concretes.Comment;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "participants")
public class Participant extends BaseEntity
{

    private String userId;
    private String eventId;

}
