package com.tobeto.a.spring.services.dtos.employee.requests;

import lombok.Data;

@Data
public class AddEmployeeRequest {
    private String name;
    private String surname;
    private int age;
    private String adress;
    private int phone;

}
