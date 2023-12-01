package com.tobeto.a.spring.services.dtos.customer.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCustomerAdress {
    private  int id;
    private String surname;
    private String adress;

}
