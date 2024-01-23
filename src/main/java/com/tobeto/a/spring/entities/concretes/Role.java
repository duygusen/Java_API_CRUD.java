package com.tobeto.a.spring.entities.concretes;

import com.tobeto.a.spring.entities.abstracts.BaseEntity;
import org.springframework.security.core.GrantedAuthority;

public class Role extends BaseEntity implements GrantedAuthority {
    private String name;



    @Override
    public String getAuthority() {
        return name;
    }
}
