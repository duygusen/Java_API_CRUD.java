package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.car.responses.GetListCarModelYear;
import com.tobeto.a.spring.services.dtos.car.responses.GetListCarStatus;
import com.tobeto.a.spring.services.dtos.employee.requests.AddEmployeeRequest;
import com.tobeto.a.spring.services.dtos.employee.requests.DeleteEmployeeRequest;
import com.tobeto.a.spring.services.dtos.employee.requests.UpdateEmployeeRequest;
import com.tobeto.a.spring.services.dtos.employee.responses.GetListEmployeeAge;
import com.tobeto.a.spring.services.dtos.employee.responses.GetListEmployeeNameAndSurname;

import java.util.List;

public interface EmployeeService {
    void add(AddEmployeeRequest request);
    void update(UpdateEmployeeRequest request);
    void delete(DeleteEmployeeRequest request);

    List<GetListEmployeeNameAndSurname> getByNameDto(String name, String surname);
    List<GetListEmployeeAge> getByAgeDto(int age);
}
