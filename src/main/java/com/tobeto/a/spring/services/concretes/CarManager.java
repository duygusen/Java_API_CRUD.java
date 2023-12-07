package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.entities.Brand;
import com.tobeto.a.spring.entities.Car;
import com.tobeto.a.spring.repositories.CarRepository;
import com.tobeto.a.spring.services.abstracts.BrandService;
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

        //İs kurallari

        List<Car> carSameWithName = carRepository.findByModelName(request.getModelName());

        if(!carSameWithName.isEmpty()){
            throw new RuntimeException("Aynı araç modelinden 2 adet olamaz");
        }

        int carNameLenght = request.getModelName().length();

        if(carNameLenght <2){
            throw  new RuntimeException("Model ismi 2'den küçük olamaz.");
        }

        //Mapleme
        Car car = new Car();
        car.setModelYear(request.getModelYear());
        car.setModelName(request.getModelName());
        car.setDailyPrice(request.getDailyPrice());
        car.setStatus(request.getStatus());
        car.setColor(request.getColor());

        //FK alanları => FK alıp, db'den ilgili obje alarak set ederiz.
        //Brand brand = brandService.getById(request.getBrandId());
        //car.setBrand(brand);

        carRepository.save(car);
    }

    @Override
    public void update(UpdateCarRequest request) {

        //İs kurallari
        double dailyPriceMinCount = request.getDailyPrice();
        if(dailyPriceMinCount <100){
            throw new RuntimeException("Günlük minimum tutar 100'den küçük olamaz.");
        }

        String status = request.getStatus();
        if ("Avaliable".equals(status) || "Busy".equals(status) ){
            throw new RuntimeException("Uygun statüs girilmemişir. Lütfen Avaliable veya Busy şeklinde girniz.");
        }


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
