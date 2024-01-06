package com.tobeto.a.spring.entities.concretes;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.mapping.Document;
import com.tobeto.a.spring.entities.abstracts.BaseEntity;

@Document(collection = "users")
@Data
public class User extends BaseEntity
{
    private String username;
    private String email;
    private String password;
    private Profile profile;

}
