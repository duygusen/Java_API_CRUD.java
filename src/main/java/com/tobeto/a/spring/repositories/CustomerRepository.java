package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.Customer;
import com.tobeto.a.spring.services.dtos.customer.responses.GetListCustomerAdress;
import com.tobeto.a.spring.services.dtos.customer.responses.GetListCustomerPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("Select Distinct new com.tobeto.a.spring.services.dtos.customer.responses.GetListCustomerAdress(c.id, c.surname, c.adress) From Customer c Where c.surname Like 'c%'")
    List<GetListCustomerAdress> findByAdressStartingWith(@Param("adress") String adress);

    @Query("Select new com.tobeto.a.spring.services.dtos.customer.responses.GetListCustomerPhone(c.id, c.phone) From Customer c Where c.phone = :phone")
    List<GetListCustomerPhone> findByPhone (@Param("phone") int phone);
}
