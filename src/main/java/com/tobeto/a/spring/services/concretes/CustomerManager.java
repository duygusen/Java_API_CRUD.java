package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.entities.Customer;
import com.tobeto.a.spring.repositories.CustomerRepository;
import com.tobeto.a.spring.services.abstracts.CustomerService;
import com.tobeto.a.spring.services.dtos.customer.requests.AddCustomerRequest;
import com.tobeto.a.spring.services.dtos.customer.requests.DeleteCustomerRequest;
import com.tobeto.a.spring.services.dtos.customer.requests.UpdateCustomerRequest;
import com.tobeto.a.spring.services.dtos.customer.responses.CustomerResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void add(AddCustomerRequest request) {

        //İs kurallari
        int ageRole = request.getAge();
        if (ageRole < 18){
            throw new RuntimeException("Yaş 18'den küçük olmaz.");
        }

        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setSurname(request.getSurname());
        customer.setAge(request.getAge());
        customer.setAdress(request.getAdress());
        customer.setPhone(request.getPhone());
        customerRepository.save(customer);
    }

    @Override
    public void update(UpdateCustomerRequest request) {
        //İs kurallari
        String phoneBusinessRole = String.valueOf(request.getPhone());
        if(phoneBusinessRole.length() < 10){
            throw new RuntimeException("Telefon numarası 10 karakterden az olamaz.");
        }

        Customer customerToUpdate = customerRepository.findById(request.getId()).orElseThrow();
        customerToUpdate.setName(request.getName());
        customerToUpdate.setSurname(request.getSurname());
        customerToUpdate.setAge(request.getAge());
        customerToUpdate.setAdress(request.getAdress());
        customerToUpdate.setPhone(request.getPhone());
        customerRepository.save(customerToUpdate);
    }

    @Override
    public void delete(DeleteCustomerRequest request) {
        Customer customerToDelete = customerRepository.findById(request.getId()).orElseThrow();
        customerRepository.delete(customerToDelete);
    }

    @Override
    public List<CustomerResponse> getByAdress(String adress) {
        List<CustomerResponse> customerList = customerRepository.findByAdressStartingWith(adress);
        return customerList.stream().map(customer -> new CustomerResponse(customer.getId(), customer.getSurname(), customer.getAdress())).toList();
    }

    @Override
    public List<CustomerResponse> getByPhone(int phone) {

        return customerRepository.findByPhone(phone);
    }
}
