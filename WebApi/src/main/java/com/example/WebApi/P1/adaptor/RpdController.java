package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.RpdDto;
import com.example.WebApi.P1.application.service.RpdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class RpdController {
    final RpdService rpdService;

    @PostMapping("/add/rpd")
    public String addRpd(@RequestBody RpdDto dto) {
        String result = rpdService.create(dto);
        return result;
    }

}
