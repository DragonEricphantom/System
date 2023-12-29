package com.example.WebApi.P1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DdEntity {
    String ddList;
    String ddName;
    String ddStore;
    String ddAddr;
    String ddDelFlag;
}
