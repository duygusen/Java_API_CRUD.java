package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.CategoryService;
import com.tobeto.a.spring.services.dtos.category.requests.AddCategoryRequest;
import com.tobeto.a.spring.services.dtos.category.requests.DeleteCategoryRequest;
import com.tobeto.a.spring.services.dtos.category.requests.UpdateCategoryRequest;
import com.tobeto.a.spring.services.dtos.category.response.GetAllCategoriesResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/categories")
public class CategoriesController {

    private final CategoryService categoryService;
    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/add")
    public void add(@RequestBody @Valid AddCategoryRequest request){
        categoryService.add(request);
    }

    @PutMapping("/update")
    public void update (@RequestBody @Valid UpdateCategoryRequest request){
        categoryService.update(request);
    }

    @DeleteMapping("/delete")
    public void delete (@RequestBody DeleteCategoryRequest request){
        categoryService.delete(request);
    }

    @GetMapping("/getAll")
    public List<GetAllCategoriesResponse> getAll(){ return categoryService.getAll();}

}
