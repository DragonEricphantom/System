package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DD", schema = "Julin")
public class DdPo {
    @Id
    @Column(name = "DD_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer ddId;

    @Column(name = "DD_LIST")
    String ddList;

    @Column(name = "DD_NAME")
    String ddName;

    @Column(name = "DD_STORE")
    String ddStore;

    @Column(name = "DD_ADDR")
    String ddAddr;

    @Column(name = "DD_DEL_FLAG")
    String ddDelFlag;


}
