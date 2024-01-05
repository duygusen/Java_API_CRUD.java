package com.tobeto.a.spring.entities;

import com.tobeto.a.spring.entities.abstracts.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="brands")
@Data
public class Brand extends BaseEntity
{
    private String name;

    private List<Car> cars;

}
