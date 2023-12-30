package com.example.WebApi.P1.adaptor;


import com.example.WebApi.P1.application.dto.GuDataDto;
import com.example.WebApi.P1.application.dto.GuDto;
import com.example.WebApi.P1.application.service.GuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class GuController {
    final GuService guService;

    @PostMapping("/add/goodCategory")
    public String addGoodCategory(@RequestBody GuDto GoodsInfo) {
        String result = guService.createGoodCategory(GoodsInfo);
        return result;
    }

    @PatchMapping("/fix/goodCategory")
    public String upDateGoodCategory(@RequestBody GuDataDto Info) {
        String result = guService.upDateGoodCategory(Info);
        return result;
    }

}
