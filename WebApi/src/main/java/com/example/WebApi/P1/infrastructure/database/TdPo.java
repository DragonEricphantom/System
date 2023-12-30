package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TD", schema = "Julin")
public class TdPo {
    @Id
    @Column(name = "TD_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer tdId;

    @Column(name = "TD_SUB_CODE")
    String tdSubCode;

    @Column(name = "TD_GLIST")
    String tdGList;

    @Column(name = "TD_GNAME")
    String tdGname;

    @Column(name = "TD_GUNIT")
    String tdGunit;

    @Column(name = "TD_GNUM")
    String tdGnum;

    @Column(name = "TD_UNI_PRICE")
    String tdUniPrice;

    @Column(name = "TD_AMOUNT")
    String tdAmount;

    @Column(name = "TD_COST")
    String tdCost;

    @Column(name = "TD_REMARK")
    String tdRemark;

    @Column(name = "TD_DEL_FLAG")
    String tdDelFlag;

}
