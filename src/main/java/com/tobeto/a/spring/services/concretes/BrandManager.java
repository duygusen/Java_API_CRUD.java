package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.entities.Brand;
import com.tobeto.a.spring.repositories.BrandRepository;
import com.tobeto.a.spring.services.abstracts.BrandService;
import com.tobeto.a.spring.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.responses.BrandResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    //Stream API&Lambda Expression
    @Override
    public List<BrandResponse> getByBrandName(String name) {

        List<BrandResponse> brandList = brandRepository.findByName(name);

        return brandList.stream()
                .map(brand -> new BrandResponse(brand.getId(), brand.getName()))
                .collect(Collectors.toList());

    }

    @Override
    public List<BrandResponse> getByBrandIdAndName(int id) {

        List<BrandResponse> brandList = brandRepository.findByIdGreaterThan(id);

        return brandList.stream()
                .map(brand -> new BrandResponse(brand.getId(), brand.getName()))
                .collect(Collectors.toList());
    }


}
