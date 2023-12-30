package com.example.WebApi.P1.adaptor;


import com.example.WebApi.P1.application.dto.DdDto;
import com.example.WebApi.P1.application.service.DdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class DdController {
    final DdService ddService;

    @PostMapping("/add/DD")
    public String addDD(@RequestBody DdDto dto) {
        String result = ddService.create(dto);
        return result;
    }


}
