package com.tobeto.a.spring.services.dtos.customer.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddCustomerRequest {
    @NotNull
    private String name;

    private String surname;

    private int age;

    private String adress;

    private int phone;
}
