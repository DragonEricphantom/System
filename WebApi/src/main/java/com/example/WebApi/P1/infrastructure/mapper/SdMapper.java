package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.SdDto;
import com.example.WebApi.P1.domain.entity.SdEntity;
import com.example.WebApi.P1.infrastructure.database.SdPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SdMapper {
    SdMapper INSTANCE = Mappers.getMapper(SdMapper.class);

    SdDto doEntity2Dto(SdEntity sdEntity);

    SdEntity doPo2Entity(SdPo sdPo);

    SdEntity doDto2Entity(SdDto sdDto);

//    SdPo doEntity2Po(SdEntity sdEntity);

    public SdPo doEntity2Po(SdEntity sdPo);

}
