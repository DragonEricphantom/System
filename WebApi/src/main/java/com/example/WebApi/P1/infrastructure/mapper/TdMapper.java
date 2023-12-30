package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.TdDto;
import com.example.WebApi.P1.application.dto.TmDto;
import com.example.WebApi.P1.domain.entity.TdEntity;
import com.example.WebApi.P1.infrastructure.database.TdPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TdMapper {
    TdMapper INSTANCE = Mappers.getMapper(TdMapper.class);

    TdEntity doDto2Entity(TdDto dto);

    TdEntity doPo2Entity(TdPo po);

    TmDto doEntity2Dto(TdEntity entity);

    TdPo doEntity2Po(TdEntity entity);
}
