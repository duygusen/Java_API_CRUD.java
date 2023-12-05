package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.entities.Car;
import com.tobeto.a.spring.repositories.CarRepository;
import com.tobeto.a.spring.services.abstracts.CarService;
import com.tobeto.a.spring.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.a.spring.services.dtos.car.responses.CarResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


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
    public List<CarResponse> getByStatus(String status) {

        List<CarResponse> carList = carRepository.findByStatus(status);
        return carList.stream()
                .map(car -> new CarResponse(car.getId(), car.getStatus()))
                .collect(Collectors.toList());
    }

    @Override
    public List<CarResponse> getByModelYear(int modelYear) {

        List<CarResponse> carList = carRepository.findByModelYear(modelYear);
        return carList.stream()
                .map(car -> new CarResponse(car.getId(), car.getModelYear()))
                .collect(Collectors.toList());
    }

}
