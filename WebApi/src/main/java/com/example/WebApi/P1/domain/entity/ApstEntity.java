package com.example.WebApi.P1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApstEntity {
    String apstYear;
    String apstMon;
    String apstDep;
    String apstGList;
    String apstGca;
    String apstGcount;
    String apstGamount;
}
