package com.tobeto.a.spring.entities;

import com.tobeto.a.spring.entities.abstracts.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "employees")
public class Employee extends BaseEntity
{

    private String name;

    private String surname;

    private int age;

    private String adress;

    private int phone;

    private List<Car> cars;

    private List<Payment> payment;

}
