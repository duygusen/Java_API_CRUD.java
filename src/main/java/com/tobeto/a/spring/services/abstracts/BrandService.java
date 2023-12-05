package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.entities.Brand;
import com.tobeto.a.spring.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.responses.BrandResponse;

import java.util.List;

public interface BrandService {
    void add(AddBrandRequest request);
    void update(UpdateBrandRequest request);
    void delete(DeleteBrandRequest request);

    List<Brand> getByName(String name);
    List <BrandResponse>getByBrandName(String name);

    //List<GetListBrandResponse> getByNameDto(String name);

    List<BrandResponse> getByBrandIdAndName(int id);

}
