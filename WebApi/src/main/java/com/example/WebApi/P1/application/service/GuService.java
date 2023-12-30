package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.GuDataDto;
import com.example.WebApi.P1.application.dto.GuDto;
import com.example.WebApi.P1.domain.entity.GuEntity;
import com.example.WebApi.P1.domain.gateway.GuGateway;
import com.example.WebApi.P1.infrastructure.mapper.GuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
public class GuService {

    @Autowired
    GuGateway gateway;

    public String createGoodCategory(GuDto GoodsInfoDto) {
        System.out.println("GoodsInfo:" + GoodsInfoDto.toString());
        // 設置資料創建人資訊
//        String user = LoginUser.getAccount();
//        request.getData().getUpdData().setUser(user);
        //check 檢查機制

        GuEntity entity = GuMapper.INSTANCE.doDto2Entity(GoodsInfoDto);

        System.out.println("theEntity:" + entity);

        gateway.save(entity);

        return "success";
    }

    public String upDateGoodCategory(GuDataDto InfoDto) {
        System.out.println("GoodCategory Update:" + InfoDto);
        // 設置資料創建人資訊
//        String user = LoginUser.getAccount();
//        request.getData().getUpdData().setUser(user);
        //check 檢查機制

        return null;
    }


}
