package com.example.WebApi.P1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RpdEntity {

    String rpdSubNum;
    String rpdCrtNum;
    String rpdSubList;
    String rpdCa;
    String rpdDate;
    String rpdBalance;
    String rpdDisAmount;
    String rpdStrAmount;
}
