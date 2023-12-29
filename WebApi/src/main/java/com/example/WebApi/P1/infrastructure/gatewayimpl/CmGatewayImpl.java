package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.CmEntity;
import com.example.WebApi.P1.domain.gateway.CmGateway;
import com.example.WebApi.P1.infrastructure.database.CmJpaRepository;
import com.example.WebApi.P1.infrastructure.database.CmPo;
import com.example.WebApi.P1.infrastructure.mapper.CmMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CmGatewayImpl implements CmGateway {
    final CmJpaRepository cmJpaRepository;

    @Override
    public CmEntity save(CmEntity entity) {
        System.out.println("in save");

        var po = CmMapper.INSTANCE.doEntity2Po(entity);

        System.out.println(po);

        CmPo thePo = cmJpaRepository.save(po);

        var returnEntity = CmMapper.INSTANCE.doPo2Entity(thePo);

        return returnEntity;
    }
}
