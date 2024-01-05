package com.tobeto.a.spring.entities;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import com.tobeto.a.spring.entities.abstracts.BaseEntity;

@Document(collection="cars")
@Data
public class Car extends BaseEntity
{
    private int modelYear;

    private String modelName;

    private double dailyPrice;

    private String color;

    private String status;

    private Brand brand;

    private Employee employee;

    private Payment payment;

    private Customer customer;

}
