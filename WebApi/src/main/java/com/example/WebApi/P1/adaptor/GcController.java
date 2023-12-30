package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.GcDto;
import com.example.WebApi.P1.application.service.GcService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class GcController {

    final GcService gcService;

    @GetMapping("/get/Goods/Categories")
    public List<GcDto> GetCategory() {
        String result = gcService.getCategory();
        return null;
    }

    @PostMapping("/add/Goods/Category")
    public String addCategory(@RequestBody GcDto gcDto) {
        System.out.println("add category");
        gcService.AddCategory(gcDto);
        return null;
    }
}
