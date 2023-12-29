package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.CmDto;
import com.example.WebApi.P1.application.service.CmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class CmController {
    final CmService cmService;

    @PostMapping("/add/CM")
    public String addCm(@RequestBody CmDto dto) {
        String result = cmService.created(dto);
        return result;
    }

}
