package com.tobeto.a.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name="payments")
@Entity
@Getter
@Setter
public class Payment
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "discount")
    private double discount;

    @Column(name="payment_method")
    private String paymentMethod;

    @OneToMany(mappedBy = "payment")
    private List<Car> cars;

    @OneToMany(mappedBy = "payment")
    private List<Customer> customers;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;




}
