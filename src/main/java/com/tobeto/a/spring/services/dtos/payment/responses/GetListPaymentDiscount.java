package com.tobeto.a.spring.services.dtos.payment.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListPaymentDiscount {
    private  int id;
    private double discount;

}
