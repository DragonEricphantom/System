package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.CmcDto;
import com.example.WebApi.P1.application.service.CmcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class CMCController {
    final CmcService cmcService;

    @PostMapping("/add/cmc")
    public String add(@RequestBody CmcDto dto) {
        String result = cmcService.create(dto);
        return result;
    }

}
