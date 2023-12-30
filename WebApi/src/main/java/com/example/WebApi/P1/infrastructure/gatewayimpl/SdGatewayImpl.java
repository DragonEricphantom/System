package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.SdEntity;
import com.example.WebApi.P1.domain.gateway.SdGateway;
import com.example.WebApi.P1.infrastructure.database.SdJpaRepository;
import com.example.WebApi.P1.infrastructure.database.SdPo;
import com.example.WebApi.P1.infrastructure.mapper.SdMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SdGatewayImpl implements SdGateway {
    final SdJpaRepository sdJpaRepository;

    @Override
    public SdEntity save(SdEntity entity) {
        System.out.println("Save sd");

        var po = SdMapper.INSTANCE.doEntity2Po(entity);

        SdPo sdPo = sdJpaRepository.save(po);

        System.out.println("sdPo:" + sdPo);

        return null;
    }
}
