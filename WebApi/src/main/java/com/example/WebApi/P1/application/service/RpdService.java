package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.RpdDto;
import com.example.WebApi.P1.domain.entity.RpdEntity;
import com.example.WebApi.P1.domain.gateway.RpdGateway;
import com.example.WebApi.P1.infrastructure.mapper.RpdMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
public class RpdService {
    final RpdGateway rpdGateway;

    public String create(RpdDto dto) {
        System.out.println("create:" + dto);

        RpdEntity entity = RpdMapper.INSTANCE.doDto2Entity(dto);

        rpdGateway.save(entity);

        return "success";
    }
}
