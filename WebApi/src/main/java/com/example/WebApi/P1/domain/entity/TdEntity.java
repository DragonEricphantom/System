package com.example.WebApi.P1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class TdEntity {

    String tdSubCode;
    String tdGList;
    String tdGname;
    String tdGunit;
    String tdGnum;
    String tdUniPrice;
    String tdAmount;
    String tdCost;
    String tdRemark;
    String tdDelFlag;
}