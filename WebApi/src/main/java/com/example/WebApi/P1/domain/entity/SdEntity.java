package com.example.WebApi.P1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class SdEntity {
    Integer sdId;
    String sdName;
    String sdMobPhone;
    String sdPhone;
    String sdAddr;
    String sdDlist; //部門編號
    String sdRemark;
    String sdResign;
    String sdBirDay;
    String sdAccount;
    String sdPwd;

}
