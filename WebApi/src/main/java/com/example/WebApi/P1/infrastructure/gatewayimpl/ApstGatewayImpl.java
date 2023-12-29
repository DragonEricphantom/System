package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.ApstEntity;
import com.example.WebApi.P1.domain.gateway.ApstGateway;
import com.example.WebApi.P1.infrastructure.database.ApstJpaRepository;
import com.example.WebApi.P1.infrastructure.database.ApstPo;
import com.example.WebApi.P1.infrastructure.mapper.ApstMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApstGatewayImpl implements ApstGateway {

    final ApstJpaRepository apstJpaRepository;

    @Override
    public ApstEntity save(ApstEntity entity) {
        System.out.println("save");

        var po = ApstMapper.INSTANCE.doEntity2Po(entity);

        System.out.println("Po:" + po);

        var returnEntity = ApstMapper.INSTANCE.doPo2Entity(po);

        System.out.println("returnEntity:" + returnEntity);

        ApstPo apstPo = apstJpaRepository.save(po);


        return returnEntity;
    }
}
