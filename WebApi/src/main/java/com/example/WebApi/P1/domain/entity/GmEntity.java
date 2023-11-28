package com.example.WebApi.P1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class GmEntity {

    Integer gmId;
    String gList;
    String gName;
    String gUnit;
    String gQrcode;
    String gBcode;
    String gcn;
    String gmn;
    String pd;
    String price;
    String genDis;
    String memDis;
    String purDis;
    String genPrice;
    String memPrice;
    String purPrice;
    String crtDate;
    String delFlag;
}
