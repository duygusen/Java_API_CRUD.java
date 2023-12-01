package com.tobeto.a.spring.services.dtos.customer.requests;

import lombok.Data;

@Data
public class UpdateCustomerRequest {
    private  int id;
    private String name;
    private String surname;
    private int age;
    private String adress;
    private int phone;
}
