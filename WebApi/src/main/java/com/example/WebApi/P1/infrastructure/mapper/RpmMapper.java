package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.RpmDto;
import com.example.WebApi.P1.domain.entity.RpmEntity;
import com.example.WebApi.P1.infrastructure.database.RpmPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RpmMapper {

    RpmMapper INSTANCE = Mappers.getMapper(RpmMapper.class);

    RpmEntity doDto2Entity(RpmDto dto);

    RpmEntity doPo2Entity(RpmPo po);

    RpmDto doEntity2Dto(RpmEntity entity);

    RpmPo doEntity2Po(RpmEntity entity);

}
