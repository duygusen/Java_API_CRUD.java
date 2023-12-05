package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.a.spring.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.a.spring.services.dtos.customer.requests.UpdateCustomerRequest;
import com.tobeto.a.spring.services.dtos.customer.responses.CustomerResponse;
import com.tobeto.a.spring.services.dtos.customer.responses.GetListCustomerAdress;
import com.tobeto.a.spring.services.dtos.customer.responses.GetListCustomerPhone;
import com.tobeto.a.spring.services.dtos.employee.responses.GetListEmployeeAge;
import com.tobeto.a.spring.services.dtos.employee.responses.GetListEmployeeNameAndSurname;

import java.util.List;

public interface CustomerService {
    void add(AddCustomerRequest request);
    void update(UpdateCustomerRequest request);
    void delete(DeleteCustomerRequest request);

    List<CustomerResponse> getByAdress(String adress);
    List<CustomerResponse> getByPhone(int phone);
}
