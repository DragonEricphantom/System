package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.GcDto;
import com.example.WebApi.P1.domain.entity.GcEntity;
import com.example.WebApi.P1.domain.gateway.GcGateway;
import com.example.WebApi.P1.infrastructure.mapper.GcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GcService {

    @Autowired
    GcGateway gateway;

    public String getCategory() {
        System.out.println("getCategory");

        return null;
    }

    public String AddCategory(GcDto gcDto) {
        System.out.println("save category");
        GcEntity entity = GcMapper.INSTANCE.doDto2Entity(gcDto);
        gateway.save(entity);
        return null;
    }
}
