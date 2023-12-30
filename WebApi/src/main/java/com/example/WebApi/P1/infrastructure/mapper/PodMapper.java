package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.PodDto;
import com.example.WebApi.P1.domain.entity.PodEntity;
import com.example.WebApi.P1.infrastructure.database.PodPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PodMapper {
    PodMapper INSTANCE = Mappers.getMapper(PodMapper.class);

    PodEntity doDto2Entity(PodDto dto);

    PodEntity doPo2Entity(PodPo po);

    PodPo doEntity2Po(PodEntity entity);

    PodDto doEntity2Dto(PodEntity entity);
}
