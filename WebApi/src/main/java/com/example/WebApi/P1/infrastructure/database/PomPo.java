package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "POM", schema = "Julin")
public class PomPo {
    @Id
    @Column(name = "POM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer pomId;

    @Column(name = "POM_CA")
    String pomCa;

    @Column(name = "POM_LIST")
    String pomList;

    @Column(name = "POM_SUB_NUM")
    String pomSubNum;

    @Column(name = "POM_DATE")
    String pomDate;

    @Column(name = "POM_PERSON")
    String pomPerson;

    @Column(name = "POM_DLIST")
    String pomDlist;

    @Column(name = "POM_SLIST")
    String pomSlist;

    @Column(name = "POM_AMOUNT")
    String pomAmount;

    @Column(name = "POM_G_TAL_AMOUNT")
    String pomGTalAmount;

    @Column(name = "POM_BUS_TAXI")
    String pomBusTaxi;

    @Column(name = "POM_TAL_AMOUNT")
    String pomTalAmount;

    @Column(name = "POM_DIS_AMOUNT")
    String pomDisAmount;

    @Column(name = "POM_ADDR")
    String pomAddr;

    @Column(name = "POM_DEL_FLAG")
    String pomDelFlag;


}
