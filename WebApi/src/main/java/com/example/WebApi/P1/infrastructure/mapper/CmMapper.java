package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.CmDto;
import com.example.WebApi.P1.domain.entity.CmEntity;
import com.example.WebApi.P1.infrastructure.database.CmPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CmMapper {
    CmMapper INSTANCE = Mappers.getMapper(CmMapper.class);

    CmEntity doDto2Entity(CmDto dto);

    CmEntity doPo2Entity(CmPo po);

    CmPo doEntity2Po(CmEntity entity);

    CmDto doEntity2Dto(CmEntity entity);
}
