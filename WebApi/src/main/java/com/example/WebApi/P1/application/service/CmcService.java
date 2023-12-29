package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.CmcDto;
import com.example.WebApi.P1.domain.entity.CmcEntity;
import com.example.WebApi.P1.domain.gateway.CmcGateway;
import com.example.WebApi.P1.infrastructure.mapper.CmcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
//@RequiredArgsConstructor
public class CmcService {
//    final CmcGateway cmcGateway;

    @Autowired
    CmcGateway cmcGateway;

    public String create(CmcDto dto) {
        System.out.println("Dto:" + dto);
        CmcEntity entity = CmcMapper.INSTANCE.doDto2Entity(dto);
        cmcGateway.save(entity);
        return "success";
    }
}
