package com.example.WebApi.P1.infrastructure.database;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "GU", schema = "Julin")
public class GuPo implements Serializable {
    private static final long serialVersionUID = 3L;

    @Id
    @Column(name = "GU_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer guId;

    @Column(name = "GU_Ch_UNIT")
    String guChUnit;

    @Column(name = "GU_ENG_UNIT")
    String guEngUnit;

}
