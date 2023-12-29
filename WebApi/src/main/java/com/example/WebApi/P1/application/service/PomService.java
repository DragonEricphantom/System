package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.PomDto;
import com.example.WebApi.P1.domain.entity.PomEntity;
import com.example.WebApi.P1.domain.gateway.PomGateway;
import com.example.WebApi.P1.infrastructure.mapper.PomMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PomService {

    final PomGateway pomGateway;

    public String create(PomDto dto) {
        System.out.println("save Dto:" + dto);

        PomEntity entity = PomMapper.INSTANCE.doDto2Entity(dto);

        PomEntity theentity = pomGateway.save(entity);
        System.out.println("theEntity:" + theentity);
        return "success";
    }
}
