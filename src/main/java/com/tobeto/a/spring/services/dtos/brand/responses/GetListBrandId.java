package com.tobeto.a.spring.services.dtos.brand.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListBrandId {
    private int id;
    private String name;
}
