package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "RPD", schema = "Julin")
public class RpdPo {

    @Id
    @Column(name = "PRD_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer rpdId;

    @Column(name = "RPD_SUB_NUM")
    String rpdSubNum;

    @Column(name = "RPD_CRT_NUM")
    String rpdCrtNum;

    @Column(name = "RPD_SUB_LIST")
    String rpdSubList;

    @Column(name = "RPD_CA")
    String rpdCa;

    @Column(name = "RPD_DATE")
    String rpdDate;

    @Column(name = "RPD_BALANCE")
    String rpdBalance;

    @Column(name = "RPD_DIS_AMOUNT")
    String rpdDisAmount;

    @Column(name = "RPD_STR_AMOUNT")
    String rpdStrAmount;
}
