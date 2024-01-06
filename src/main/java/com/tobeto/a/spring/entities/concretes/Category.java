package com.tobeto.a.spring.entities.concretes;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import com.tobeto.a.spring.entities.abstracts.BaseEntity;

@Document(collection="categories")
@Data
public class Category extends BaseEntity
{
    private String categoryName;

}
