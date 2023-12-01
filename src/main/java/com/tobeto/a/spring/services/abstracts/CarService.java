package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.brand.responses.GetListBrandResponse;
import com.tobeto.a.spring.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.services.dtos.car.requests.UpdateCarRequest;
import com.tobeto.a.spring.services.dtos.car.responses.GetListCarModelYear;
import com.tobeto.a.spring.services.dtos.car.responses.GetListCarStatus;

import java.util.List;

public interface CarService {
    void add(AddCarRequest request);
    void update(UpdateCarRequest request);
    void delete(DeleteCarRequest request);

    List<GetListCarStatus> getByStatusDto(String status);
    List<GetListCarModelYear> getByModelYearDto(int modelYear);

}
