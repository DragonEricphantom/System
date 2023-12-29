package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.ApstDto;
import com.example.WebApi.P1.application.service.ApstService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class ApstController {
    final ApstService apstService;

    @PostMapping("/add/apst")
    public String addApst(@RequestBody ApstDto dto) {
        String result = apstService.create(dto);
        return result;
    }

}
