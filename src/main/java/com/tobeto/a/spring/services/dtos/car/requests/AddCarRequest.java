package com.tobeto.a.spring.services.dtos.car.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddCarRequest {
    private int modelYear;

    @NotBlank
    private String modelName;

    private double dailyPrice;

    @NotNull
    private String color;

    private String status;

    //private int brandId;
}
