package com.example.WebApi.dao.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user", schema = "db")
public class User {
    @Id
    @JsonProperty("id")
    private Integer ID;
    @JsonProperty("username")
    private String USERNAME;
    @JsonProperty("password")
    private String PASSWORD;

    private String PHONENUMBER;
    private String IDENTIFY;
    private String BIRTHDAY;
}
