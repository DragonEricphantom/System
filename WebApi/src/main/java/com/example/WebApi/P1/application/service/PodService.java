package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.PodDto;
import com.example.WebApi.P1.domain.entity.PodEntity;
import com.example.WebApi.P1.domain.gateway.PodGateway;
import com.example.WebApi.P1.infrastructure.mapper.PodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
public class PodService {
    @Autowired
    PodGateway podGateway;

    public String create(PodDto dto) {
        System.out.println("Dto:" + dto);

        PodEntity entity = PodMapper.INSTANCE.doDto2Entity(dto);

        PodEntity theEntity = podGateway.save(entity);
        System.out.println("theEntity:" + theEntity);

        return "success";
    }
}
