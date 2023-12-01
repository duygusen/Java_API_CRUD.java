package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.CustomerService;
import com.tobeto.a.spring.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.a.spring.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.a.spring.services.dtos.customer.requests.UpdateCustomerRequest;
import com.tobeto.a.spring.services.dtos.customer.responses.GetListCustomerAdress;
import com.tobeto.a.spring.services.dtos.customer.responses.GetListCustomerPhone;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomersController {
    private final CustomerService customerService;
    public CustomersController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void add(@RequestBody AddCustomerRequest request){
        customerService.add(request);
    }

    @PutMapping("{id}")
    public void update (@RequestBody UpdateCustomerRequest request){
        customerService.update(request);
    }

    @DeleteMapping("{id}")
    public void delete (@RequestBody DeleteCustomerRequest request){
        customerService.delete(request);
    }

    @GetMapping("dto/customers/adress")
    public List<GetListCustomerAdress> getByAdressDto(@RequestParam String adress){
        return customerService.getByAdressDto(adress);
    }

    @GetMapping("dto/customers/phone")
    public List<GetListCustomerPhone> getByPhoneDto(@RequestParam int phone){
        return customerService.getByPhoneDto(phone);
    }
}
