package com.tobeto.a.spring.services.dtos.category.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddCategoryRequest {
    private String categoryName;
}
