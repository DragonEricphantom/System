package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CMC", schema = "Julin")
public class CmcPo {
    @Id
    @Column(name = "CMC_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer cmcId;

    @Column(name = "CMC_CA")
    String cmcCa;

    @Column(name = "CMC_LIST")
    String cmcList;

    @Column(name = "CMC_NAME")
    String cmcName;

    @Column(name = "CMC_DEL_FLAG")
    String cmcDelFlag;

}
