package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.GuEntity;
import com.example.WebApi.P1.domain.gateway.GuGateway;
import com.example.WebApi.P1.infrastructure.database.GuJpaRepository;
import com.example.WebApi.P1.infrastructure.mapper.GuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GuGateWayImpl implements GuGateway {

    final GuJpaRepository jpaRepository;

    @Override
    public GuEntity save(GuEntity entity) {
        System.out.println("save");
        System.out.println("entity:" + entity);
        var po = GuMapper.INSTANCE.doEntity2Po(entity);

        System.out.println("po:" + po);

        var theEntity = GuMapper.INSTANCE.doPo2Entity(po);
        System.out.println("Entity:" + theEntity);

        jpaRepository.save(po);

        return null;
    }
}
