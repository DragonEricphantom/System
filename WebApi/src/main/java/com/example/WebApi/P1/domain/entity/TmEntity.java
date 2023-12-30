package com.example.WebApi.P1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class TmEntity {

    String tList;
    String tmSubCode;
    String tDate;
    String tCustomer;
    String conPerson;
    String conPhone;
    String uniNum;
    String sedPerson;
    String sedAddr;
    String depNum;
    String makerDoc;
    String remark;
    String totalCost;
    String talGAmount;
    String busTax;
    String talAmount;
    String disAmount;
    String amountPaid;
    String tmCrtDate;
    String tmUpdDate;
    String tmDelFlag;
}
