package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.TmDto;
import com.example.WebApi.P1.domain.entity.TmEntity;
import com.example.WebApi.P1.infrastructure.database.TmPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TmMapper {

    TmMapper INSTANCE = Mappers.getMapper(TmMapper.class);

    TmEntity doDto2Entity(TmDto dto);

    TmPo doEntity2Po(TmEntity entity);

    TmEntity doPo2Entity(TmPo po);

    TmDto doEntity2Dto(TmEntity entity);


}
