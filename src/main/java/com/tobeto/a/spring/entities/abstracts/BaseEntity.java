package com.tobeto.a.spring.entities.abstracts;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "base_entities")
public class BaseEntity {
    @Id
    private String id;
}
