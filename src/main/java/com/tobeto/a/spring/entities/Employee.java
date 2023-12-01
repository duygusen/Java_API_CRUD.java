package com.tobeto.a.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name="employees")
@Entity
@Getter
@Setter
public class Employee
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="age")
    private int age;

    @Column(name="adress")
    private String adress;

    @Column(name="phone")
    private int phone;

    @OneToMany(mappedBy = "employee")
    private List<Car> cars;
    @OneToMany(mappedBy = "employee")
    private List<Payment> payment;

}
