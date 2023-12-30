package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.TmDataDto;
import com.example.WebApi.P1.application.dto.TmDto;
import com.example.WebApi.P1.application.service.TmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class TmController {
    final TmService tmService;

    @PostMapping("/add/Trad")
    public String addTrad(@RequestBody TmDto tradInfo) {
        String result = tmService.createGood(tradInfo);
        return result;
    }

    @PatchMapping("/fix/Trad")
    public String fixTrad(@RequestBody TmDataDto updateTrad) {
        String result = tmService.upDateGood(updateTrad);
        return result;
    }

}
