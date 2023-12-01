package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.entities.Brand;
import com.tobeto.a.spring.repositories.BrandRepository;
import com.tobeto.a.spring.services.abstracts.BrandService;
import com.tobeto.a.spring.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.responses.GetListBrandId;
import com.tobeto.a.spring.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void add(AddBrandRequest request) {
        //iş süreclerini ekle

        Brand brand = new Brand();
        brand.setName(request.getName());
        brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest request) {
        Brand brandToUpdate = brandRepository.findById(request.getId()).orElseThrow();
        brandToUpdate.setName(request.getName());
        brandRepository.save(brandToUpdate);
    }

    @Override
    public void delete(DeleteBrandRequest request){
        Brand brandToDelete = brandRepository.findById(request.getId()).orElseThrow();
        brandRepository.delete(brandToDelete);
    }

    @Override
    public List<Brand> getByName(String name) {

        return brandRepository.findByNameStartingWith(name);
    }

    @Override
    public List<GetListBrandResponse> getByNameDto(String name) {
        return brandRepository.findByName(name);
    }

    @Override
    public List<GetListBrandId> getByIdAndNameDto(int id) {
        return brandRepository.findByIdGreaterThan(id);
    }


}
