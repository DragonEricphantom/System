package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.CmcDto;
import com.example.WebApi.P1.domain.entity.CmcEntity;
import com.example.WebApi.P1.infrastructure.database.CmcPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CmcMapper {
    CmcMapper INSTANCE = Mappers.getMapper(CmcMapper.class);

    CmcDto doEntity2Dto(CmcEntity entity);

    CmcEntity doDto2Entity(CmcDto dto);

    CmcEntity doPo2Entity(CmcPo po);

    CmcPo doEntity2Po(CmcEntity entity);


}
