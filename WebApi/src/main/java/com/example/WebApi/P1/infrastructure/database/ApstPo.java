package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "APST", schema = "Julin")
public class ApstPo {
    @Id
    @Column(name = "APST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer tmId;

    @Column(name = "APST_YEAR")
    String apstYear;

    @Column(name = "APST_MON")
    String apstMon;

    @Column(name = "APST_DEP")
    String apstDep;

    @Column(name = "APST_GLIST")
    String apstGList;

    @Column(name = "APST_GCA")
    String apstGca;

    @Column(name = "APST_GCOUNT")
    String apstGcount;

    @Column(name = "APST_GAMOUNT")
    String apstGamount;
}
