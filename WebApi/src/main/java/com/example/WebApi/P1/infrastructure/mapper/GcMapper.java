package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.GcDto;
import com.example.WebApi.P1.domain.entity.GcEntity;
import com.example.WebApi.P1.infrastructure.database.GcPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GcMapper {
    GcMapper INSTANCE = Mappers.getMapper(GcMapper.class);

    GcDto doEntity2Dto(GcEntity gcEntity);

    GcEntity doPo2Entity(GcPo gcPo);

    GcEntity doDto2Entity(GcDto gcDto);

//    SdPo doEntity2Po(SdEntity sdEntity);

    public GcPo doEntity2Po(GcEntity gcPo);
}
