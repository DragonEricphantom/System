package com.example.WebApi.P1.infrastructure.database;


import com.example.WebApi.util.CharConverter;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
//@IdClass(GMPoId.class)
@Table(name = "GM", schema = "Julin")
public class GmPo implements Serializable {
    @Id
    @Column(name = "GID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer gId;

    @Column(name = "GLIST", unique = true)
    String gList;

    @Column(name = "GNAME")
    String gName;

    @Column(name = "GUNIT")
    String gUnit;

    @Column(name = "GQRCODE")
    String gQrcode;

    @Column(name = "GBCODE")
    String gBcode;

    @Column(name = "GCN")
    String gcn;

    @Column(name = "GMN")
    String gmn;

    @Column(name = "PD")
    String pd;

    @Column(name = "PRICE")
    String price;

    @Column(name = "GEN_DIS")
    String genDis;

    @Column(name = "MEM_DIS")
    String memDis;

    @Column(name = "PUR_DIS")
    String purDis;

    @Column(name = "GEN_PRICE")
    String genPrice;

    @Column(name = "MEM_PRICE")
    String memPrice;

    @Column(name = "PUR_PRICE")
    String purPrice;

    @Column(name = "GM_CRT_DATE")
    String crtDate;

    @Column(name = "GM_DEL_FLAG", length = 1)
    @Convert(converter = CharConverter.class)
    String delFlag;
}
