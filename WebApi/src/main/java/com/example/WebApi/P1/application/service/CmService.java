package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.CmDto;
import com.example.WebApi.P1.domain.entity.CmEntity;
import com.example.WebApi.P1.domain.gateway.CmGateway;
import com.example.WebApi.P1.infrastructure.mapper.CmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
public class CmService {
    @Autowired
    CmGateway cmGateway;

    public String created(CmDto dto) {
        System.out.println("dto:" + dto);

        CmEntity entity = CmMapper.INSTANCE.doDto2Entity(dto);
        CmEntity theEntity = cmGateway.save(entity);
        return "success";
    }

}
