package com.tobeto.a.spring.entities;

import com.tobeto.a.spring.entities.abstracts.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "payments")
public class Payment  extends BaseEntity {

    private double amount;

    private double discount;

    private String paymentMethod;

    private List<Car> cars;

    private List<Customer> customers;

    private Employee employee;

}
