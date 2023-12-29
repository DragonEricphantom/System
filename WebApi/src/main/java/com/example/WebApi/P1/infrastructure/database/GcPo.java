package com.example.WebApi.P1.infrastructure.database;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "GC", schema = "Julin")
public class GcPo {
    private static final long serialVersionUID = 3L;

    @Id
    @Column(name = "GC_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer gcId;

    @Column(name = "GC_LIST")
    String gcList;

    @Column(name = "GC_NAME")
    String gcName;


}
