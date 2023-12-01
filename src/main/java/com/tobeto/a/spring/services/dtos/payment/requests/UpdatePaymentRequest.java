package com.tobeto.a.spring.services.dtos.payment.requests;

import lombok.Data;

@Data
public class UpdatePaymentRequest {
    private  int id;
    private double amount;
    private double discount;
    private String paymentMethod;
}
