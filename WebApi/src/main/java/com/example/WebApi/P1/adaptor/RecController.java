package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.RecDto;
import com.example.WebApi.P1.application.service.RecService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class RecController {
    final RecService recService;

    @PostMapping("/add/rec")
    public String addTrad(@RequestBody RecDto dto) {
        String result = recService.create(dto);
        return result;
    }

}
