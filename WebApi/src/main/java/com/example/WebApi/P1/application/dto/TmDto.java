package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TmDto {

    @JsonProperty("tList")
    String tList;

    @JsonProperty("tDate")
    String tDate;

    @JsonProperty("tCustomer")
    String tCustomer;

    @JsonProperty("conPerson")
    String conPerson;

    @JsonProperty("conPhone")
    String conPhone;

    @JsonProperty("uniNum")
    String uniNum;

    @JsonProperty("sedPerson")
    String sedPerson;

    @JsonProperty("sedAddr")
    String sedAddr;

    @JsonProperty("depNum")
    String depNum;

    @JsonProperty("makerDoc")
    String makerDoc;

    @JsonProperty("remark")
    String remark;

    @JsonProperty("totalCost")
    String totalCost;

    @JsonProperty("talGAmount")
    String talGAmount;

    @JsonProperty("busTax")
    String busTax;

    @JsonProperty("talAmount")
    String talAmount;

    @JsonProperty("disAmount")
    String disAmount;

    @JsonProperty("amountPaid")
    String amountPaid;

    @JsonProperty("crtDate")
    String crtDate;
}
