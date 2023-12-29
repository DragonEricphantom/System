package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PomDto {
    @JsonProperty("pomCa")
    String pomCa;
    @JsonProperty("pomList")
    String pomList;
    @JsonProperty("pomSubNum")
    String pomSubNum;
    @JsonProperty("pomDate")
    String pomDate;
    @JsonProperty("pomPerson")
    String pomPerson;
    @JsonProperty("pomDlist")
    String pomDlist;
    @JsonProperty("pomSlist")
    String pomSlist;
    @JsonProperty("pomAmount")
    String pomAmount;
    @JsonProperty("pomGTalAmount")
    String pomGTalAmount;
    @JsonProperty("pomBusTaxi")
    String pomBusTaxi;
    @JsonProperty("pomTalAmount")
    String pomTalAmount;
    @JsonProperty("pomDisAmount")
    String pomDisAmount;
    @JsonProperty("pomAddr")
    String pomAddr;
    @JsonProperty("pomDelFlag")
    String pomDelFlag;
}
