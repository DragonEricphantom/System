package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.RpmEntity;
import com.example.WebApi.P1.domain.gateway.RpmGateway;
import com.example.WebApi.P1.infrastructure.database.RpmJpaRepository;
import com.example.WebApi.P1.infrastructure.database.RpmPo;
import com.example.WebApi.P1.infrastructure.mapper.RpmMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RpmGatewayImpl implements RpmGateway {
    final RpmJpaRepository rpmJpaRepository;

    public RpmEntity save(RpmEntity entity) {
        System.out.println("save");
        var po = RpmMapper.INSTANCE.doEntity2Po(entity);

        RpmPo thePo = rpmJpaRepository.save(po);

        RpmEntity theEntity = RpmMapper.INSTANCE.doPo2Entity(thePo);

        return theEntity;
    }

}
