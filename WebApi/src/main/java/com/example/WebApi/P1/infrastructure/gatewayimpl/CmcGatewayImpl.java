package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.CmcEntity;
import com.example.WebApi.P1.domain.gateway.CmcGateway;
import com.example.WebApi.P1.infrastructure.database.CmcJpaRepository;
import com.example.WebApi.P1.infrastructure.database.CmcPo;
import com.example.WebApi.P1.infrastructure.mapper.CmcMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CmcGatewayImpl implements CmcGateway {
    final CmcJpaRepository cmcJpaRepository;


    @Override
    public CmcEntity save(CmcEntity entity) {
        System.out.println("entity:" + entity);
        var po = CmcMapper.INSTANCE.doEntity2Po(entity);
        System.out.println("po:" + po);
        CmcPo thePo = cmcJpaRepository.save(po);
        CmcEntity theEntity = CmcMapper.INSTANCE.doPo2Entity(thePo);
        return theEntity;
    }
}
