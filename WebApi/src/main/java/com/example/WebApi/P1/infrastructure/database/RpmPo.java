package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "RPM", schema = "Julin")
public class RpmPo {
    @Id
    @Column(name = "RPM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer rpmId;

    @Column(name = "RPM_CA")
    String rpmCa;

    @Column(name = "RPM_LIST")
    String rpmList;

    @Column(name = "RPM_SUB_NUM")
    String rpmSubNum;

    @Column(name = "RPM_DATE")
    String rpmDate;

    @Column(name = "RPM_PERSON")
    String rpmPerson;

    @Column(name = "RPM_DLIST")
    String rpmDList;

    @Column(name = "RPM_AMOUNT")
    String rpmAmount;

    @Column(name = "RPM_DIS_AMOUNT")
    String rpmDisAmount;

    @Column(name = "RPM_TAL_AMOUNT")
    String rpmTalAmount;

    @Column(name = "RPM_DEL_FLAG")
    String rpmDelFlag;

}
