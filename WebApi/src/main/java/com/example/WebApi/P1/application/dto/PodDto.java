package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PodDto {
    @JsonProperty("podSubNum")
    String podSubNum;
    @JsonProperty("podCrtNum")
    String podCrtNum;
    @JsonProperty("podGList")
    String podGList;
    @JsonProperty("podGname")
    String podGname;
    @JsonProperty("podGunit")
    String podGunit;
    @JsonProperty("podGcount")
    String podGcount;
    @JsonProperty("podUniPrice")
    String podUniPrice;
    @JsonProperty("podDisAmount")
    String podDisAmount;
    @JsonProperty("podAmount")
    String podAmount;
}
