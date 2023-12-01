package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.Payment;
import com.tobeto.a.spring.services.dtos.employee.responses.GetListEmployeeAge;
import com.tobeto.a.spring.services.dtos.employee.responses.GetListEmployeeNameAndSurname;
import com.tobeto.a.spring.services.dtos.payment.responses.GetListPaymentDiscount;
import com.tobeto.a.spring.services.dtos.payment.responses.GetListPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    @Query("Select new com.tobeto.a.spring.services.dtos.payment.responses.GetListPaymentDiscount(p.id, p.discount) From Payment p Where p.discount = :discount")
    List<GetListPaymentDiscount> findByPaymentDiscount(@Param("discount") double discount);

    @Query("Select new com.tobeto.a.spring.services.dtos.payment.responses.GetListPaymentMethod(p.id, p.paymentMethod) From Payment p Where p.paymentMethod = :paymentMethod")
    List<GetListPaymentMethod> findByPaymentMethod(@Param("paymentMethod") String paymentMethod);
}
