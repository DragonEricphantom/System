package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.DdEntity;
import com.example.WebApi.P1.domain.gateway.DdGateway;
import com.example.WebApi.P1.infrastructure.database.DdJpaRepository;
import com.example.WebApi.P1.infrastructure.database.DdPo;
import com.example.WebApi.P1.infrastructure.mapper.DdMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DdGatewayImpl implements DdGateway {

    final DdJpaRepository ddJpaRepository;

    @Override
    public DdEntity save(DdEntity entity) {
        System.out.println("save");
        var po = DdMapper.INSTANCE.doEntity2Po(entity);

        DdPo thePo = ddJpaRepository.save(po);

        DdEntity theEntity = DdMapper.INSTANCE.doPo2Entity(thePo);

        return theEntity;
    }
}
