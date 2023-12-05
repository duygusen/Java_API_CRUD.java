package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.Brand;
import com.tobeto.a.spring.services.dtos.brand.responses.BrandResponse;
import com.tobeto.a.spring.services.dtos.brand.responses.GetListBrandId;
import com.tobeto.a.spring.services.dtos.brand.responses.GetListBrandResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer>
{

    List<Brand> findByNameStartingWith(String name);

    //@Query("Select new com.tobeto.a.spring.services.dtos.brand.responses.GetListBrandResponse(b.id, b.name)" +
            //"FROM Brand b WHERE b.name= :name")
    //List<GetListBrandResponse> findByBrandName(@Param("name") String Name);
    @Query("SELECT new com.tobeto.a.spring.services.dtos.brand.responses.BrandResponse(b.id, b.name) FROM Brand b WHERE b.name = :name")
    List<BrandResponse> findByName(@Param("name") String name);

    @Query("Select new com.tobeto.a.spring.services.dtos.brand.responses.BrandResponse(b.id, b.name) From Brand b Where b.id > :id")
    List<BrandResponse> findByIdGreaterThan(@Param("id") int id);

}
