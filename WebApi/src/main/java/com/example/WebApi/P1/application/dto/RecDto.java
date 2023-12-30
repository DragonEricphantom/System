package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RecDto {
    @JsonProperty("recCa")
    String recCa;
    @JsonProperty("recTList")
    String recTList;
    @JsonProperty("recTDate")
    String recTDate;
    @JsonProperty("recTcustomer")
    String recTcustomer;
    @JsonProperty("recSflist")
    String recSflist;
    @JsonProperty("recGList")
    String recGList;
    @JsonProperty("recGname")
    String recGname;
    @JsonProperty("recGcount")
    String recGcount;
    @JsonProperty("recGunit")
    String recGunit;
    @JsonProperty("recGprice")
    String recGprice;
    @JsonProperty("recGamount")
    String recGamount;
    @JsonProperty("recRemark")
    String recRemark;
}
