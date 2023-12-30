package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SD", schema = "Julin")
public class SdPo {

    @Id
    @Column(name = "SD_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer sdId;

    @Column(name = "SD_NAME")
    String sdName;

    @Column(name = "SD_MOB_PHONE")
    String sdMobPhone;

    @Column(name = "SD_PHONE")
    String sdPhone;

    @Column(name = "SD_ADDR")
    String sdAddr;

    @Column(name = "SD_DLIST")
    String sdDlist; //部門編號

    @Column(name = "SD_REMARK")
    String sdRemark;

    @Column(name = "SD_RESIGN")
    String sdResign;

    @Column(name = "SD_BIR_DATE")
    String sdBirDate;

    @Column(name = "SD_ACCOUNT")
    String sdAccount;

    @Column(name = "SD_PWD")
    String sdPwd;


}
