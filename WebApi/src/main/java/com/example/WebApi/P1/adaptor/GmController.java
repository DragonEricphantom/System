package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.GmDataDto;
import com.example.WebApi.P1.application.dto.GmDto;
import com.example.WebApi.P1.application.service.GmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
//@Tag(name = "Trade Main API", description = "出貨單 API")
public class GmController {
    final GmService gmService;

    @PostMapping("/add/good")
    public String addGood(@RequestBody GmDto GoodsInfo) {
        String result = gmService.createGood(GoodsInfo);
        return result;
    }

    @PatchMapping("/fix/good")
    public String upDateGood(@RequestBody GmDataDto Info) {
//        String result = gmService.createGood(Info);
        String result = gmService.upDateGood(Info);
        return result;
    }


}
