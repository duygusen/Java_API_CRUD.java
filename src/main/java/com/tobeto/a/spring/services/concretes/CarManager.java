package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.entities.Car;
import com.tobeto.a.spring.repositories.CarRepository;
import com.tobeto.a.spring.services.abstracts.CarService;
import com.tobeto.a.spring.services.dtos.brand.responses.GetListBrandResponse;
import com.tobeto.a.spring.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.a.spring.services.dtos.car.responses.GetListCarModelYear;
import com.tobeto.a.spring.services.dtos.car.responses.GetListCarStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {
    private final CarRepository carRepository;
    public CarManager(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    @Override
    public void add(AddCarRequest request) {
        Car car = new Car();
        car.setModelYear(request.getModelYear());
        car.setModelName(request.getModelName());
        car.setDailyPrice(request.getDailyPrice());
        car.setStatus(request.getStatus());
        car.setColor(request.getColor());
        carRepository.save(car);
    }

    @Override
    public void update(UpdateCarRequest request) {
        Car carToUpdate = carRepository.findById(request.getId()).orElseThrow();
        carToUpdate.setModelYear(request.getModelYear());
        carToUpdate.setModelName(request.getModelName());
        carToUpdate.setDailyPrice(request.getDailyPrice());
        carToUpdate.setStatus(request.getStatus());
        carToUpdate.setColor(request.getColor());
        carRepository.save(carToUpdate);
    }

    @Override
    public void delete(DeleteCarRequest request) {
        Car carToDelete = carRepository.findById(request.getId()).orElseThrow();
        carRepository.delete(carToDelete);
    }

    @Override
    public List<GetListCarStatus> getByStatusDto(String status) {
        return carRepository.findByStatus(status);
    }

    @Override
    public List<GetListCarModelYear> getByModelYearDto(int modelYear) {
        return carRepository.findByModelYear(modelYear);
    }

}
