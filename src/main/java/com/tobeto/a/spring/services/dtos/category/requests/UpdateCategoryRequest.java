package com.tobeto.a.spring.services.dtos.category.requests;

import lombok.Data;

@Data
public class UpdateCategoryRequest {
    private String id;
    private String categoryName;
}
