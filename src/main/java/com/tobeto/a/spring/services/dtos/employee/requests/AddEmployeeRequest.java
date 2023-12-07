package com.tobeto.a.spring.services.dtos.employee.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class AddEmployeeRequest {
    @NotBlank
    private String name;

    private String surname;

    @Positive
    private int age;

    private String adress;

    private int phone;

}
