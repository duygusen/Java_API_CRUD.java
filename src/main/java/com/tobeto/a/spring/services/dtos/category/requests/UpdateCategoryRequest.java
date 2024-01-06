package com.tobeto.a.spring.services.dtos.category.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateCategoryRequest {
    private String id;
    private String categoryName;
}
