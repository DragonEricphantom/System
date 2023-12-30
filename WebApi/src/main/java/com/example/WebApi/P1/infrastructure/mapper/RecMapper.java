package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.RecDto;
import com.example.WebApi.P1.domain.entity.RecEntity;
import com.example.WebApi.P1.infrastructure.database.RecPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecMapper {

    RecMapper INSTANCE = Mappers.getMapper(RecMapper.class);

    RecEntity doDto2Entity(RecDto dto);

    RecPo doEntity2Po(RecEntity entity);

    RecEntity doPo2Entity(RecPo po);

    RecDto doEntity2Dto(RecEntity entity);
}
