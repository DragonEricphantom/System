package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.PomDto;
import com.example.WebApi.P1.application.service.PomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class PoMController {
    final PomService pomService;

    @PostMapping("/add/pom")
    public String addPom(@RequestBody PomDto dto) {
        String result = pomService.create(dto);
        return result;
    }


}
