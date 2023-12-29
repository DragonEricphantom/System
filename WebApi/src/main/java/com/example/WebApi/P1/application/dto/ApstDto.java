package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApstDto {
    @JsonProperty("apstYear")
    String apstYear;
    @JsonProperty("apstMon")
    String apstMon;
    @JsonProperty("apstDep")
    String apstDep;
    @JsonProperty("apstGList")
    String apstGList;
    @JsonProperty("apstGca")
    String apstGca;
    @JsonProperty("apstGcount")
    String apstGcount;
    @JsonProperty("apstGamount")
    String apstGamount;
}
