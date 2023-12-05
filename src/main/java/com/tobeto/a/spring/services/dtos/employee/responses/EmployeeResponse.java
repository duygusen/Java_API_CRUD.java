package com.tobeto.a.spring.services.dtos.employee.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private  int id;
    private String name;
    private int age;
    private String surname;

    public EmployeeResponse(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public EmployeeResponse(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
