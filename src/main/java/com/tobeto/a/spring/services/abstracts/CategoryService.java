package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.category.requests.AddCategoryRequest;
import com.tobeto.a.spring.services.dtos.category.requests.DeleteCategoryRequest;
import com.tobeto.a.spring.services.dtos.category.requests.UpdateCategoryRequest;
import com.tobeto.a.spring.services.dtos.category.response.GetAllCategoriesResponse;

import java.util.List;

public interface CategoryService {
    void add(AddCategoryRequest request);
    void update(UpdateCategoryRequest request);
    void delete(DeleteCategoryRequest request);

    List<GetAllCategoriesResponse> getAll();
}
