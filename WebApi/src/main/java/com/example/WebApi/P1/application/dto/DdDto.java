package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DdDto {

    @JsonProperty("ddList")
    String ddList;
    @JsonProperty("ddName")
    String ddName;
    @JsonProperty("ddStore")
    String ddStore;
    @JsonProperty("ddAddr")
    String ddAddr;
    @JsonProperty("ddDelFlag")
    String ddDelFlag;
}
