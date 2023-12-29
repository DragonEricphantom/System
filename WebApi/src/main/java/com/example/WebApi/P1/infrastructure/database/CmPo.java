package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CM", schema = "Julin")
public class CmPo {
    @Id
    @Column(name = "CM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer cmId;

    @Column(name = "CM_CA")
    String cmCa;

    @Column(name = "CM_LIST")
    String cmList;

    @Column(name = "CM_CM")
    String cmCm;

    @Column(name = "CM_CNAME")
    String cmCname;

    @Column(name = "CM_CNAMES")
    String cmCnameS;

    @Column(name = "CM_CA_NUM")
    String cmCaNum;

    @Column(name = "CM_DLIST")
    String cmDlist;

    @Column(name = "CM_CUNI_NUM")
    String cmCuniNum;

    @Column(name = "CM_CRT_DATE")
    String cmCrtDate;

    @Column(name = "CM_PERSON")
    String cmPerson;

    @Column(name = "CM_CON_PERSON")
    String cmConPerson;

    @Column(name = "CM_CON_PHONE")
    String cmConPhone;

    @Column(name = "CM_MOB_PHONE")
    String cmMobPhone;

    @Column(name = "CM_ADDR")
    String cmAddr;

    @Column(name = "CM_CHANGE_DATE")
    String cmChangeDate;

    @Column(name = "CM_REMARK")
    String cmRemark;

    @Column(name = "CM_DNUM")
    String cmDnum;

    @Column(name = "CM_DEL_FLAG")
    String cmDelFlag;


}
