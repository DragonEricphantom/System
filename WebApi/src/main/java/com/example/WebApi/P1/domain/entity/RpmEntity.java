package com.example.WebApi.P1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RpmEntity {
    String rpmCa;
    String rpmList;
    String rpmSubNum;
    String rpmDate;
    String rpmPerson;
    String rpmDList;
    String rpmAmount;
    String rpmDisAmount;
    String rpmTalAmount;
    String rpmDelFlag;
}
