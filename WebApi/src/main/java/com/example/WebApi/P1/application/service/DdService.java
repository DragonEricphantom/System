package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.DdDto;
import com.example.WebApi.P1.domain.entity.DdEntity;
import com.example.WebApi.P1.domain.gateway.DdGateway;
import com.example.WebApi.P1.infrastructure.mapper.DdMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DdService {

    final DdGateway ddGateway;

    public String create(DdDto dto) {
        System.out.println("Dto:" + dto);
        DdEntity entity = DdMapper.INSTANCE.doDto2Entity(dto);
        DdEntity AnsEntity = ddGateway.save(entity);
        System.out.println("ansEntity:" + AnsEntity);
        return "success";
    }

}
