package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.TdDto;
import com.example.WebApi.P1.domain.entity.TdEntity;
import com.example.WebApi.P1.domain.gateway.TdGateway;
import com.example.WebApi.P1.infrastructure.mapper.TdMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
public class TdService {

    final TdGateway gateway;

    public String createDetail(TdDto dto) {
        System.out.println("Dto:" + dto);

        TdEntity entity = TdMapper.INSTANCE.doDto2Entity(dto);
        gateway.save(entity);
        return "success";
    }
}
