package com.tobeto.a.spring.services.dtos.employee.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateEmployeeRequest {
    private  int id;

    private String name;

    @NotBlank
    private String surname;

    private int age;

    private String adress;

    private int phone;

}
