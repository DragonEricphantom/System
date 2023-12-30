package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.PodDto;
import com.example.WebApi.P1.application.service.PodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class PodController {
    final PodService podService;

    @PostMapping("/add/pod")
    public String addPod(@RequestBody PodDto dto) {
        String result = podService.create(dto);
        return result;
    }


}
