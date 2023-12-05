package com.tobeto.a.spring.services.dtos.payment.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {
    private  int id;
    private double discount;
    private String paymentMethod;

    public PaymentResponse(int id, double discount) {
        this.id = id;
        this.discount = discount;
    }

    public PaymentResponse(int id, String paymentMethod) {
        this.id = id;
        this.paymentMethod = paymentMethod;
    }
}
