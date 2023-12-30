package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.TdEntity;
import com.example.WebApi.P1.domain.gateway.TdGateway;
import com.example.WebApi.P1.infrastructure.database.TdJpaRepository;
import com.example.WebApi.P1.infrastructure.database.TdPo;
import com.example.WebApi.P1.infrastructure.mapper.TdMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TdGatewayImpl implements TdGateway {
    final TdJpaRepository jpaRepository;

    public TdEntity save(TdEntity entity) {
        System.out.println("save entity:" + entity);

        var po = TdMapper.INSTANCE.doEntity2Po(entity);

        TdPo thePo = jpaRepository.save(po);

        TdEntity returnEntity = TdMapper.INSTANCE.doPo2Entity(thePo);

        return returnEntity;
    }

}
