package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RpmDto {
    @JsonProperty("rpmCa")
    String rpmCa;
    @JsonProperty("rpmList")
    String rpmList;
    @JsonProperty("rpmSubNum")
    String rpmSubNum;
    @JsonProperty("rpmDate")
    String rpmDate;
    @JsonProperty("rpmPerson")
    String rpmPerson;
    @JsonProperty("rpmDList")
    String rpmDList;
    @JsonProperty("rpmAmount")
    String rpmAmount;
    @JsonProperty("rpmDisAmount")
    String rpmDisAmount;
    @JsonProperty("rpmTalAmount")
    String rpmTalAmount;
    @JsonProperty("rpmDelFlag")
    String rpmDelFlag;
}
