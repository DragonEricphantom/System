package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.RpmDto;
import com.example.WebApi.P1.domain.entity.RpmEntity;
import com.example.WebApi.P1.domain.gateway.RpmGateway;
import com.example.WebApi.P1.infrastructure.mapper.RpmMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
public class RpmService {
    final RpmGateway rpmGateway;

    public String create(RpmDto dto) {
        System.out.println("dto:" + dto);

        RpmEntity entity = RpmMapper.INSTANCE.doDto2Entity(dto);
        rpmGateway.save(entity);
        return "success";
    }
}
