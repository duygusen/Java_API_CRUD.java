package com.tobeto.a.spring.services.dtos.payment.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddPaymentRequest {

    private double amount;

    @Max(value = 99, message = "İndirim en çok 99 olabilir.")
    private double discount;


    private String paymentMethod;


}
