package com.tobeto.a.spring.services.dtos.payment.requests;

import lombok.Data;

@Data
public class AddPaymentRequest {
    private double amount;
    private double discount;
    private String paymentMethod;


}
