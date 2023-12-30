package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.GuDto;
import com.example.WebApi.P1.domain.entity.GuEntity;
import com.example.WebApi.P1.infrastructure.database.GuPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GuMapper {
    GuMapper INSTANCE = Mappers.getMapper(GuMapper.class);

    GuEntity doPo2Entity(GuPo po);

    GuEntity doDto2Entity(GuDto dto);

    GuDto doEntity2Dto(GuEntity guEntity);

    GuPo doEntity2Po(GuEntity guEntity);
}
