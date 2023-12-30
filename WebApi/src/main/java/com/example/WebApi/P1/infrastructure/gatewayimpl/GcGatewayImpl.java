package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.GcEntity;
import com.example.WebApi.P1.domain.gateway.GcGateway;
import com.example.WebApi.P1.infrastructure.database.GcJpaRepository;
import com.example.WebApi.P1.infrastructure.mapper.GcMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GcGatewayImpl implements GcGateway {


    final GcJpaRepository jpaRepository;

    @Override
    public GcEntity save(GcEntity entity) {
        System.out.println("save Gc GatewayImpl");

        System.out.println("save");

        var po = GcMapper.INSTANCE.doEntity2Po(entity);

        System.out.println("PO:" + po);

        jpaRepository.save(po);

//        if (po.getNcifId() == null || po.getNcifId() == 0) {
//            po.setNcifId(IdConvert.toLong(po.getNcifIdNmbr()));
//        }

        var entitys = GcMapper.INSTANCE.doPo2Entity(po);
        System.out.println("entity:" + entitys);

//        return GMMapper.INSTANCE.doPo2Entity(cusNcifPo);


        return null;
    }
}
