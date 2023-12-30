package com.example.WebApi.P1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PodEntity {
    String podSubNum;
    String podCrtNum;
    String podGList;
    String podGname;
    String podGunit;
    String podGcount;
    String podUniPrice;
    String podDisAmount;
    String podAmount;
}
