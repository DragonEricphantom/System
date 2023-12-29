package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.RecEntity;
import com.example.WebApi.P1.domain.gateway.RecGateway;
import com.example.WebApi.P1.infrastructure.database.RecJpaRepository;
import com.example.WebApi.P1.infrastructure.database.RecPo;
import com.example.WebApi.P1.infrastructure.mapper.RecMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecGatewayImpl implements RecGateway {
    final RecJpaRepository recJpaRepository;

    @Override
    public RecEntity save(RecEntity entity) {
        System.out.println("save");

        var po = RecMapper.INSTANCE.doEntity2Po(entity);

        System.out.println("Po:" + po);

        var returnEntity = RecMapper.INSTANCE.doPo2Entity(po);

        System.out.println("returnEntity:" + returnEntity);

        RecPo Po = recJpaRepository.save(po);

        return null;
    }
}
