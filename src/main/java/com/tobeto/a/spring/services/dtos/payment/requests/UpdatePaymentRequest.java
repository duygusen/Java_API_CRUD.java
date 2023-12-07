package com.tobeto.a.spring.services.dtos.payment.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdatePaymentRequest {
    private  int id;

    private double amount;

    private double discount;

    @NotNull
    private String paymentMethod;
}
