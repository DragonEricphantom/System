package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.RpdDto;
import com.example.WebApi.P1.domain.entity.RpdEntity;
import com.example.WebApi.P1.infrastructure.database.RpdPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RpdMapper {

    RpdMapper INSTANCE = Mappers.getMapper(RpdMapper.class);

    RpdEntity doDto2Entity(RpdDto dto);

    RpdPo doEntity2Po(RpdEntity entity);

    RpdEntity doPo2Entity(RpdPo po);

    RpdDto doEntity2Dto(RpdEntity entity);

}
