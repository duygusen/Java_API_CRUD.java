package com.tobeto.a.spring.services.dtos.brand.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateBrandRequest {

    private int id;

    @NotNull
    private String name;
}
