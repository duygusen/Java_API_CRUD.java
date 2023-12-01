package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.employee.responses.GetListEmployeeAge;
import com.tobeto.a.spring.services.dtos.employee.responses.GetListEmployeeNameAndSurname;
import com.tobeto.a.spring.services.dtos.payment.requests.AddPaymentRequest;
import com.tobeto.a.spring.services.dtos.payment.requests.DeletePaymentRequest;
import com.tobeto.a.spring.services.dtos.payment.requests.UpdatePaymentRequest;
import com.tobeto.a.spring.services.dtos.payment.responses.GetListPaymentDiscount;
import com.tobeto.a.spring.services.dtos.payment.responses.GetListPaymentMethod;

import java.util.List;

public interface PaymentService {
    void add(AddPaymentRequest request);
    void update(UpdatePaymentRequest request);
    void delete(DeletePaymentRequest request);

    List<GetListPaymentDiscount> getByPaymentDiscountDto(double discount);
    List<GetListPaymentMethod> getByPaymentMethodDto(String paymentMethod);
}
