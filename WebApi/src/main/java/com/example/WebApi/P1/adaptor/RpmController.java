package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.RpmDto;
import com.example.WebApi.P1.application.service.RpmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class RpmController {
    final RpmService rpmService;

    @PostMapping("/add/rpmDetail")
    public String addRpm(@RequestBody RpmDto dto) {
        String result = rpmService.create(dto);
        return result;
    }


}
