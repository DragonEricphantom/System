package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TM", schema = "Julin")
public class TmPo {
    @Id
    @Column(name = "TID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer tmId;

    @Column(name = "TLIST", unique = true)//202312310001
    String tList;

    @Column(name = "T_DATE")
    String tDate;

    @Column(name = "T_CUSTOMER")
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

    @Column(name = "CRT_DATE")
    String crtDate;

    @Column(name = "DEL_FLAG")
    String delFlag;

}
