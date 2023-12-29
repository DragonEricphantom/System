package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.RpdEntity;
import com.example.WebApi.P1.domain.gateway.RpdGateway;
import com.example.WebApi.P1.infrastructure.database.RpdJpaRepository;
import com.example.WebApi.P1.infrastructure.database.RpdPo;
import com.example.WebApi.P1.infrastructure.mapper.RpdMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RpdGatewayImpl implements RpdGateway {
    final RpdJpaRepository rpdJpaRepository;

    @Override
    public RpdEntity save(RpdEntity entity) {
        System.out.println("save:" + entity);

        RpdPo po = RpdMapper.INSTANCE.doEntity2Po(entity);

        RpdPo thePo = rpdJpaRepository.save(po);

        RpdEntity theEntity = RpdMapper.INSTANCE.doPo2Entity(thePo);
        return theEntity;
    }
}
