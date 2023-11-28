package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.SdDto;
import com.example.WebApi.P1.domain.entity.SdEntity;
import com.example.WebApi.P1.domain.gateway.SdGateway;
import com.example.WebApi.P1.infrastructure.mapper.SdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SdService {

    @Autowired
    SdGateway gateway;

    public String getStaff() {
        System.out.println("in Get staff service");

        return null;
    }

    public String updateStaff() {
        System.out.println("Update Staff");
        return "update success";
    }

    public String delStaff() {
        System.out.println("Del staff");
        return "Success delete staff";
    }

    public String addStaff(SdDto sdDto) {
        System.out.println("Add staff");
        SdEntity entity = SdMapper.INSTANCE.doDto2Entity(sdDto);
        gateway.save(entity);
        return "Success delete staff";
    }
}
