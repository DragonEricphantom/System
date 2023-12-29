package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.PomDto;
import com.example.WebApi.P1.domain.entity.PomEntity;
import com.example.WebApi.P1.infrastructure.database.PomPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PomMapper {

    PomMapper INSTANCE = Mappers.getMapper(PomMapper.class);

    PomEntity doDto2Entity(PomDto dto);

    PomEntity doPo2Entity(PomPo po);

    PomPo doEntity2Po(PomEntity entity);

    PomDto doEntity2Dto(PomEntity entity);
    
}
