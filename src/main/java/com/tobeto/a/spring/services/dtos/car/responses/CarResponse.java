package com.tobeto.a.spring.services.dtos.car.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarResponse {
    private  int id;
    private String status;
    private int modelYear;

    public CarResponse(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public CarResponse(int id, int modelYear) {
        this.id = id;
        this.modelYear = modelYear;
    }
}
