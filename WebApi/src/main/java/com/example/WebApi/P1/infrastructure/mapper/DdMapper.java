package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.DdDto;
import com.example.WebApi.P1.domain.entity.DdEntity;
import com.example.WebApi.P1.infrastructure.database.DdPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DdMapper {
    DdMapper INSTANCE = Mappers.getMapper(DdMapper.class);

    DdEntity doDto2Entity(DdDto dto);

    DdEntity doPo2Entity(DdPo dto);

    DdDto doEntity2Dto(DdEntity entity);

    DdPo doEntity2Po(DdEntity entity);


}
