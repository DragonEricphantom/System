package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.SdDto;
import com.example.WebApi.P1.application.service.SdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class SdController {

    final SdService sdService;

    @GetMapping("/get/staff")
    public String GetStaff() {
        System.out.println("Get staff");
        String result = sdService.getStaff();
        System.out.println(result);
        return null;
    }

    @PostMapping("/add/staff")
    public String addStaff(@RequestBody SdDto sdDto) {
        System.out.println("add staff:");
        System.out.println(sdDto);
        String result = sdService.addStaff(sdDto);
        return null;
    }


}
