package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.Customer;
import com.tobeto.a.spring.services.dtos.customer.responses.CustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("Select Distinct new com.tobeto.a.spring.services.dtos.customer.responses.CustomerResponse(c.id, c.surname, c.adress) From Customer c Where c.surname Like 'c%'")
    List<CustomerResponse> findByAdressStartingWith(@Param("adress") String adress);

    @Query("Select new com.tobeto.a.spring.services.dtos.customer.responses.CustomerResponse(c.id, c.phone) From Customer c Where c.phone = :phone")
    List<CustomerResponse> findByPhone (@Param("phone") int phone);


}
