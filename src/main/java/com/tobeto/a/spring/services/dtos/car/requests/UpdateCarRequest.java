package com.tobeto.a.spring.services.dtos.car.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateCarRequest {
    private int id;

    private int modelYear;

    private String modelName;

    @NotBlank
    private String plate;

    @Max(5000)
    private double dailyPrice;

    private String color;

    private String status;
}
