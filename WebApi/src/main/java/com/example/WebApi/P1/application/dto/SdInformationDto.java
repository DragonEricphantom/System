package com.example.WebApi.P1.application.dto;

import lombok.Data;

@Data
public class SdInformationDto {
    private Integer sdId;
    private String sdName;
    private String sdMobPhone;
    private String sdPhone;
    private String sdAddr;
    private String sdDlist; //部門編號
    private String sdRemark;
    private String sdBirDay;
}
