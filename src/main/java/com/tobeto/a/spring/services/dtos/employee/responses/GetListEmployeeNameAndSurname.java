package com.tobeto.a.spring.services.dtos.employee.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListEmployeeNameAndSurname {
    private  int id;
    private String name;
    private String surname;


}
