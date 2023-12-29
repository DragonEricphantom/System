package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.TmEntity;
import com.example.WebApi.P1.domain.gateway.TmGateway;
import com.example.WebApi.P1.infrastructure.database.TmJpaRepository;
import com.example.WebApi.P1.infrastructure.database.TmPo;
import com.example.WebApi.P1.infrastructure.mapper.TmMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TmGatewayImpl implements TmGateway {
    final TmJpaRepository jpaRepository;

    public TmEntity save(TmEntity entity) {
        System.out.println("save");

        var po = TmMapper.INSTANCE.doEntity2Po(entity);

        System.out.println("Po:" + po);

        var returnEntity = TmMapper.INSTANCE.doPo2Entity(po);

        System.out.println("returnEntity:" + returnEntity);

        TmPo tmPo = jpaRepository.save(po);

        return null;
    }
}
