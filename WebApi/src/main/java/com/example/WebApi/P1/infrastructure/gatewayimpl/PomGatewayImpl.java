package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.PomEntity;
import com.example.WebApi.P1.domain.gateway.PomGateway;
import com.example.WebApi.P1.infrastructure.database.PomJpaRepository;
import com.example.WebApi.P1.infrastructure.database.PomPo;
import com.example.WebApi.P1.infrastructure.mapper.PomMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PomGatewayImpl implements PomGateway {
    final PomJpaRepository pomJpaRepository;

    @Override
    public PomEntity save(PomEntity entity) {
        System.out.println("save:" + entity);

        PomPo po = PomMapper.INSTANCE.doEntity2Po(entity);

        PomPo thePo = pomJpaRepository.save(po);

        PomEntity theEntity = PomMapper.INSTANCE.doPo2Entity(thePo);

        return theEntity;
    }
}
