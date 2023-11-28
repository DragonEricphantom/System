package com.example.WebApi.P1.infrastructure.gatewayimpl;

import com.example.WebApi.P1.domain.entity.GmEntity;
import com.example.WebApi.P1.domain.gateway.GmGateway;
import com.example.WebApi.P1.infrastructure.database.GmJpaRepository;
import com.example.WebApi.P1.infrastructure.database.GmPo;
import com.example.WebApi.P1.infrastructure.mapper.GmMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GmGatewayImpl implements GmGateway {

    final GmJpaRepository jpaRepository;


    public GmEntity save(GmEntity entity) {
        System.out.println("save");

        var po = GmMapper.INSTANCE.doEntity2Po(entity);

        System.out.println("PO:" + po);
//        if (po.getNcifId() == null || po.getNcifId() == 0) {
//            po.setNcifId(IdConvert.toLong(po.getNcifIdNmbr()));
//        }

        var entitys = GmMapper.INSTANCE.doPo2Entity(po);
        System.out.println("entity:" + entitys);
        GmPo gmPo = jpaRepository.save(po);

        jpaRepository.save(po);
//        return GMMapper.INSTANCE.doPo2Entity(cusNcifPo);


        return null;
    }
}
