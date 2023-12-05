package com.tobeto.a.spring.services.dtos.customer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private  int id;
    private String surname;
    private String adress;
    private int phone;

    public CustomerResponse(int id, String surname, String adress) {
        this.id = id;
        this.surname = surname;
        this.adress = adress;
    }

    public CustomerResponse(int id, int phone) {
        this.id = id;
        this.phone = phone;
    }
}
