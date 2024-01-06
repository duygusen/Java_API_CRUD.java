package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.core.mappers.ModelMapperService;
import com.tobeto.a.spring.entities.concretes.Category;
import com.tobeto.a.spring.repositories.CategoryRepository;
import com.tobeto.a.spring.services.abstracts.CategoryService;
import com.tobeto.a.spring.services.dtos.category.requests.AddCategoryRequest;
import com.tobeto.a.spring.services.dtos.category.requests.DeleteCategoryRequest;
import com.tobeto.a.spring.services.dtos.category.requests.UpdateCategoryRequest;
import com.tobeto.a.spring.services.dtos.category.response.GetAllCategoriesResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public void add(AddCategoryRequest request) {

        Category category = this.modelMapperService.forRequest().map(request, Category.class);
        categoryRepository.save(category);
    }

    @Override
    public void update(UpdateCategoryRequest request) {

        Category category = this.modelMapperService.forRequest().map(request, Category.class);

        categoryRepository.save(category);
    }

    @Override
    public void delete(DeleteCategoryRequest request) {
        Category category = this.modelMapperService.forRequest().map(request, Category.class);
        categoryRepository.delete(category);
    }

    @Override
    public List<GetAllCategoriesResponse> getAll() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map(category -> this.modelMapperService.forResponse().map(category, GetAllCategoriesResponse.class))
                .toList();
    }

}
