package com.example.WebApi.P1.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CmcDto {
    @JsonProperty("cmcCa")
    String cmcCa;
    @JsonProperty("cmcList")
    String cmcList;
    @JsonProperty("cmcName")
    String cmcName;
    @JsonProperty("cmcDelFlag")
    String cmcDelFlag;
}
