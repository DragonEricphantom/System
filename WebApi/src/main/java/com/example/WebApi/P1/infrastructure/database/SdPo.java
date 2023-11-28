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

    @Column(name = "SD_NAME", unique = true)
    String sdName;

    @Column(name = "SD_MOB_PHONE", unique = true)
    String sdMobPhone;

    @Column(name = "SD_PHONE", unique = true)
    String sdPhone;

    @Column(name = "SD_ADDR", unique = true)
    String sdAddr;

    @Column(name = "SD_DLIST", unique = true)
    String sdDlist; //部門編號

    @Column(name = "SD_REMARK", unique = true)
    String sdRemark;

    @Column(name = "SD_RESIGN", unique = true)
    String sdResign;

    @Column(name = "SD_BIR_Day", unique = true)
    String sdBirDay;

    @Column(name = "SD_ACCOUNT", unique = true)
    String sdAccount;

    @Column(name = "SD_PWD", unique = true)
    String sdPwd;


}
