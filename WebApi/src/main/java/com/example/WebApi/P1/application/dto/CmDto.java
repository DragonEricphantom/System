package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CmDto {
    @JsonProperty("cmCa")
    String cmCa;
    @JsonProperty("cmList")
    String cmList;
    @JsonProperty("cmCm")
    String cmCm;
    @JsonProperty("cmCname")
    String cmCname;
    @JsonProperty("cmCnameS")
    String cmCnameS;
    @JsonProperty("cmCaNum")
    String cmCaNum;
    @JsonProperty("cmDlist")
    String cmDlist;
    @JsonProperty("cmCuniNum")
    String cmCuniNum;
    @JsonProperty("cmCrtDate")
    String cmCrtDate;
    @JsonProperty("cmPerson")
    String cmPerson;
    @JsonProperty("cmConPerson")
    String cmConPerson;
    @JsonProperty("cmConPhone")
    String cmConPhone;
    @JsonProperty("cmMobPhone")
    String cmMobPhone;
    @JsonProperty("cmAddr")
    String cmAddr;
    @JsonProperty("cmChangeDate")
    String cmChangeDate;
    @JsonProperty("cmRemark")
    String cmRemark;
    @JsonProperty("cmDnum")
    String cmDnum;
    @JsonProperty("cmDelFlag")
    String cmDelFlag;
}
