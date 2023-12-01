package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.entities.Brand;
import com.tobeto.a.spring.services.abstracts.BrandService;
import com.tobeto.a.spring.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.responses.GetListBrandId;
import com.tobeto.a.spring.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandsController
{
    private BrandService brandService;
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping
    public void add(@RequestBody AddBrandRequest request){
        brandService.add(request);
    }

    @PutMapping("{id}")
    public void update (@RequestBody UpdateBrandRequest request){
        brandService.update(request);
    }

    @DeleteMapping("{id}")
    public void delete (@RequestBody DeleteBrandRequest request){
        brandService.delete(request);
    }

    @GetMapping
    public List<Brand> getByName(@RequestParam String name){
        return  brandService.getByName(name);
    }

    @GetMapping("dto")
    public List<GetListBrandResponse> getByNameDto(@RequestParam String name){
        return  brandService.getByNameDto(name);
    }

    @GetMapping("dto/{id}")
    public List<GetListBrandId> getByIdAndNameDto(@PathVariable int id){
        return brandService.getByIdAndNameDto(id);

    }

}
