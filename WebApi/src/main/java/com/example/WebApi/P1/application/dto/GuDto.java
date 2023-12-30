package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GuDto {

    @JsonProperty("guChUnit")
    String guChUnit;

    @JsonProperty("guEngUnit")
    String guEngUnit;
}
