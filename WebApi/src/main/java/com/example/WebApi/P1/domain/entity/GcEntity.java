package com.example.WebApi.P1.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class GcEntity {

    Integer gcId;
    String gcNumber;
    String gcName;

}
