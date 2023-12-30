package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TdDto {

    @JsonProperty("tdSubCode")
    String tdSubCode;
    @JsonProperty("tdGList")
    String tdGList;
    @JsonProperty("tdGname")
    String tdGname;
    @JsonProperty("tdGunit")
    String tdGunit;
    @JsonProperty("tdGnum")
    String tdGnum;
    @JsonProperty("tdUniPrice")
    String tdUniPrice;
    @JsonProperty("tdAmount")
    String tdAmount;
    @JsonProperty("tdCost")
    String tdCost;
    @JsonProperty("tdRemark")
    String tdRemark;
    @JsonProperty("tdDelFlag")
    String tdDelFlag;

}
