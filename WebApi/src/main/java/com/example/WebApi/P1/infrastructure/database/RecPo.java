package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "REC", schema = "Julin")
public class RecPo {
    @Id
    @Column(name = "REC_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer recId;

    @Column(name = "REC_CA")
    String recCa;

    @Column(name = "REC_TLIST")
    String recTList;

    @Column(name = "REC_TDATE")
    String recTDate;

    @Column(name = "REC_TCUSTOMER")
    String recTcustomer;

    @Column(name = "REC_SFLIST")
    String recSflist;

    @Column(name = "REC_GLIST")
    String recGList;

    @Column(name = "REC_GNAME")
    String recGname;

    @Column(name = "REC_GCOUNT")
    String recGcount;

    @Column(name = "REC_GUNIT")
    String recGunit;

    @Column(name = "REC_GPRICE")
    String recGprice;

    @Column(name = "REC_GAMOUNT")
    String recGamount;

    @Column(name = "REC_REMARK")
    String recRemark;

}
