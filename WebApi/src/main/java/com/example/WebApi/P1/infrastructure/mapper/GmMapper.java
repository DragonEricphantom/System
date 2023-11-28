package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.GmDto;
import com.example.WebApi.P1.domain.entity.GmEntity;
import com.example.WebApi.P1.domain.gateway.GmGateway;
import com.example.WebApi.P1.infrastructure.database.GmPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper//在pom.xl需要加入plugin、dependency
public interface GmMapper {

    GmMapper INSTANCE = Mappers.getMapper(GmMapper.class);

    GmEntity doPo2Entity(GmPo po, GmGateway gateway);

    GmEntity doDto2Entity(GmDto dto, GmGateway gateway);

    GmDto doEntity2Dto(GmEntity gmEntity);

    GmEntity doPo2Entity(GmPo gmPo);

    public GmPo doEntity2Po(GmEntity gmPo);

//    GMPo doEntity2Po(GMEntity entity);
}
