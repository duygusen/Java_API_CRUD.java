package com.tobeto.a.spring.services.dtos.customer.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UpdateCustomerRequest {
    private  int id;

    private String name;

    private String surname;

    @Positive
    private int age;

    @NotNull
    private String adress;

    private int phone;
}
