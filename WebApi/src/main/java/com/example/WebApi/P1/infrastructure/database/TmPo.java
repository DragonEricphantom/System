package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TM", schema = "Julin")
public class TmPo {
    @Id
    @Column(name = "TM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer tmId;

    @Column(name = "TM_LIST", unique = true)//202312310001
    String tList;

    @Column(name = "TM_SUB_CODE")
    String tmSubCode;

    @Column(name = "TM_TRADE_DATE")
    String tDate;

    @Column(name = "TM_CUSTOMER")
    String tCustomer;

    @Column(name = "CON_PERSON")
    String conPerson;

    @Column(name = "CON_PHONE")
    String conPhone;

    @Column(name = "UNI_NUM")
    String uniNum;

    @Column(name = "SED_PERSON")
    String sedPerson;

    @Column(name = "SED_ADDR")
    String sedAddr;

    @Column(name = "DEP_NUM")
    String depNum;

    @Column(name = "MAKER_DOC")
    String makerDoc;

    @Column(name = "REMARK")
    String remark;

    @Column(name = "TOTAL_COST")
    String totalCost;

    @Column(name = "TAL_G_AMOUNT")
    String talGAmount;

    @Column(name = "BUS_TAX")
    String busTax;

    @Column(name = "TAL_AMOUNT")
    String talAmount;

    @Column(name = "DIS_AMOUNT")
    String disAmount;

    @Column(name = "AMOUNT_PAID")
    String amountPaid;

    @Column(name = "TM_CRT_DATE")
    String tmCrtDate;

    @Column(name = "TM_UPD_DATE")
    String tmUpdDate;

    @Column(name = "TM_DEL_FLAG")
    String tmDelFlag;

}
