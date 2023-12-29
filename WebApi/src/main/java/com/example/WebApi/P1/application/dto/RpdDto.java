package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RpdDto {
    @JsonProperty("rpdSubNum")
    String rpdSubNum;
    @JsonProperty("rpdCrtNum")
    String rpdCrtNum;
    @JsonProperty("rpdSubList")
    String rpdSubList;
    @JsonProperty("rpdCa")
    String rpdCa;
    @JsonProperty("rpdDate")
    String rpdDate;
    @JsonProperty("rpdBalance")
    String rpdBalance;
    @JsonProperty("rpdDisAmount")
    String rpdDisAmount;
    @JsonProperty("rpdStrAmount")
    String rpdStrAmount;

}
