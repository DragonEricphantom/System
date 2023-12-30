package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.PodEntity;
import com.example.WebApi.P1.domain.gateway.PodGateway;
import com.example.WebApi.P1.infrastructure.database.PodJpaRepository;
import com.example.WebApi.P1.infrastructure.database.PodPo;
import com.example.WebApi.P1.infrastructure.mapper.PodMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PodGatewayImpl implements PodGateway {
    final PodJpaRepository podJpaRepository;

    public PodEntity save(PodEntity entity) {
        System.out.println("save:" + entity);
        PodPo po = PodMapper.INSTANCE.doEntity2Po(entity);
        PodPo thePo = podJpaRepository.save(po);

        PodEntity theEntity = PodMapper.INSTANCE.doPo2Entity(thePo);
        return theEntity;
    }


}
