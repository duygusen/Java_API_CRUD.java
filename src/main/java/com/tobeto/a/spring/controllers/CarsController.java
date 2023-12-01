package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.BrandService;
import com.tobeto.a.spring.services.abstracts.CarService;
import com.tobeto.a.spring.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.responses.GetListBrandResponse;
import com.tobeto.a.spring.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.a.spring.services.dtos.car.responses.GetListCarModelYear;
import com.tobeto.a.spring.services.dtos.car.responses.GetListCarStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarsController {

    private final CarService carService;
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public void add(@RequestBody AddCarRequest request){
        carService.add(request);
    }

    @PutMapping("{id}")
    public void update (@RequestBody UpdateCarRequest request){
        carService.update(request);
    }

    @DeleteMapping("{id}")
    public void delete (@RequestBody DeleteCarRequest request){
        carService.delete(request);
    }

    @GetMapping("dto/cars/status")
    public List<GetListCarStatus> getByStatusDto(@RequestParam String status){
        return  carService.getByStatusDto(status);
    }

    @GetMapping("dto/cars/modelYear")
    public List<GetListCarModelYear> getByModelYearDto(@RequestParam int modelYear){
        return  carService.getByModelYearDto(modelYear);
    }

}
