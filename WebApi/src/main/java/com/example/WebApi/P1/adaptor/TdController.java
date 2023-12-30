package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.TdDto;
import com.example.WebApi.P1.application.service.TdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class TdController {
    final TdService tdService;

    @PostMapping("/add/TradDetail")
    public String addDetail(@RequestBody TdDto dto) {
        String result = tdService.createDetail(dto);
        return result;
    }


}
