package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.ApstDto;
import com.example.WebApi.P1.domain.entity.ApstEntity;
import com.example.WebApi.P1.domain.gateway.ApstGateway;
import com.example.WebApi.P1.infrastructure.mapper.ApstMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApstService {
    final ApstGateway apstGateway;

    public String create(ApstDto dto) {
        System.out.println("dto:" + dto);
        // 設置資料創建人資訊
//        String user = LoginUser.getAccount();
//        request.getData().getUpdData().setUser(user);


        ApstEntity entity = ApstMapper.INSTANCE.doDto2Entity(dto);
        //check 檢查機制

        apstGateway.save(entity);
        return "success";
    }
}
