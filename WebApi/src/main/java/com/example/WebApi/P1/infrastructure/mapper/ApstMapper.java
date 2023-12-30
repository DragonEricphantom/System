package com.example.WebApi.P1.infrastructure.mapper;

import com.example.WebApi.P1.application.dto.ApstDto;
import com.example.WebApi.P1.domain.entity.ApstEntity;
import com.example.WebApi.P1.infrastructure.database.ApstPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ApstMapper {
    ApstMapper INSTANCE = Mappers.getMapper(ApstMapper.class);

    ApstEntity doDto2Entity(ApstDto dto);

    ApstPo doEntity2Po(ApstEntity entity);

    ApstEntity doPo2Entity(ApstPo po);

    ApstDto doEntity2Dto(ApstEntity entity);

}
