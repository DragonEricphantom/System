package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "POD", schema = "Julin")
public class PodPo {
    @Id
    @Column(name = "POD_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer podId;

    @Column(name = "POD_SUB_NUM")
    String podSubNum;

    @Column(name = "POD_CRT_NUM")
    String podCrtNum;

    @Column(name = "POD_GLIST")
    String podGList;

    @Column(name = "POD_GNAME")
    String podGname;

    @Column(name = "POD_GUNIT")
    String podGunit;

    @Column(name = "POD_GCOUNT")
    String podGcount;

    @Column(name = "POD_UNI_PRICE")
    String podUniPrice;

    @Column(name = "POD_DIS_AMOUNT")
    String podDisAmount;

    @Column(name = "POD_AMOUNT")
    String podAmount;

}
