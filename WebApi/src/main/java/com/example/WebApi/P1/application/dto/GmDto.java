package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GmDto {
//    @JsonProperty("gId")
//    Integer gId;

    @JsonProperty("gList")
    String gList;

    @JsonProperty("gName")
    String gName;

    @JsonProperty("gUnit")
    String gUnit;

    @JsonProperty("gQrcode")
    String gQrcode;

    @JsonProperty("gBcode")
    String gBcode;

    @JsonProperty("gcn")
    String gcn;

    @JsonProperty("gmn")
    String gmn;

    @JsonProperty("pd")
    String pd;

    @JsonProperty("price")
    String price;

    @JsonProperty("genDis")
    String genDis;

    @JsonProperty("memDis")
    String memDis;

    @JsonProperty("purDis")
    String purDis;

    @JsonProperty("genPrice")
    String genPrice;

    @JsonProperty("memPrice")
    String memPrice;

    @JsonProperty("purPrice")
    String purPrice;

    @JsonProperty("crtDate")
    String crtDate;

    @JsonProperty("delFlag")
    String delFlag;


}
