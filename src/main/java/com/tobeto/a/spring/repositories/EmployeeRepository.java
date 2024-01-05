package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.Employee;
import com.tobeto.a.spring.services.dtos.employee.responses.EmployeeResponse;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
    @Query("Select new com.tobeto.a.spring.services.dtos.employee.responses.EmployeeResponse(e.id, e.name, e.surname) From Employee e Where e.name = :name And e.surname = :surname")
    List<EmployeeResponse> findByName(@Param("name") String name, @Param("surname") String surname);

    @Query("Select new com.tobeto.a.spring.services.dtos.employee.responses.EmployeeResponse(e.id, e.name, e.age) From Employee e Where e.age >= :age order by e.name desc")
    List<EmployeeResponse> findByAge(@Param("age") int age);

    boolean existsByAdress (String adress);
}
