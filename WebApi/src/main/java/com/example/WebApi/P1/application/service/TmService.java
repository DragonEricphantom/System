package com.example.WebApi.P1.application.service;

import com.example.WebApi.P1.application.dto.TmDataDto;
import com.example.WebApi.P1.application.dto.TmDto;
import com.example.WebApi.P1.domain.entity.TmEntity;
import com.example.WebApi.P1.domain.gateway.TmGateway;
import com.example.WebApi.P1.infrastructure.mapper.TmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 36000, rollbackFor = Exception.class)
public class TmService {

    @Autowired
    TmGateway gateway;

    public String createGood(TmDto GoodsInfo) {
        System.out.println("goodsInfo:" + GoodsInfo);
        // 設置資料創建人資訊
//        String user = LoginUser.getAccount();
//        request.getData().getUpdData().setUser(user);


        TmEntity entity = TmMapper.INSTANCE.doDto2Entity(GoodsInfo);
        //check 檢查機制

        gateway.save(entity);

        return "success";
    }

    public String upDateGood(TmDataDto updateGood) {
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
