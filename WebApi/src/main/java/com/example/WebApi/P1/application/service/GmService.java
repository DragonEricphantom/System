package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.GmDataDto;
import com.example.WebApi.P1.application.dto.GmDto;
import com.example.WebApi.P1.domain.entity.GmEntity;
import com.example.WebApi.P1.domain.gateway.GmGateway;
import com.example.WebApi.P1.infrastructure.mapper.GmMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
public class GmService {

    @Autowired
    GmGateway gateway;

    public String createGood(GmDto GoodsInfo) {
        System.out.println("goodsInfo:" + GoodsInfo);
        // 設置資料創建人資訊
//        String user = LoginUser.getAccount();
//        request.getData().getUpdData().setUser(user);
        //check 檢查機制

        GmEntity entity = GmMapper.INSTANCE.doDto2Entity(GoodsInfo, gateway);

        gateway.save((entity));

        return "success";
    }

    public String upDateGood(GmDataDto updateGood) {
        System.out.println("goodsInfo:" + updateGood);
        System.out.println(updateGood.oriData);
        System.out.println(updateGood.updData);
        // 設置資料創建人資訊
//        String user = LoginUser.getAccount();
//        request.getData().getUpdData().setUser(user);
        //check 檢查機制

//        GMEntity entity = GMMapper.INSTANCE.doDto2Entity(GoodsInfo, gateway);

//        gateway.save((entity));

        return "success";
    }

}
