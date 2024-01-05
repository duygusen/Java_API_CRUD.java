package com.tobeto.a.spring.entities;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import com.tobeto.a.spring.entities.abstracts.BaseEntity;

import java.util.List;
@Document(collection = "customers")
@Data
public class Customer extends BaseEntity
{
    private String name;

    private String surname;

    private int age;

    private int phone;

    private String adress;

    private List<Car> cars;

    private Payment payment;

}
