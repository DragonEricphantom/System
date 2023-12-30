package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.RecDto;
import com.example.WebApi.P1.domain.entity.RecEntity;
import com.example.WebApi.P1.domain.gateway.RecGateway;
import com.example.WebApi.P1.infrastructure.mapper.RecMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecService {
    final RecGateway recGateway;

    public String create(RecDto dto) {
        System.out.println("dto:" + dto);
        RecEntity entity = RecMapper.INSTANCE.doDto2Entity(dto);
        recGateway.save(entity);
        return "success";
    }
}
