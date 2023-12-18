package com.example.WebApi.P1.adaptor;

import com.example.WebApi.P1.application.dto.SdDto;
import com.example.WebApi.P1.application.dto.SdInformationDto;
import com.example.WebApi.P1.application.service.SdService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;


@Slf4j
@RequestMapping("/api/p1")
@RestController
@RequiredArgsConstructor
public class SdController {

    final SdService sdService;

    @GetMapping("/get/staffs")
    public Page<SdInformationDto> GetStaff(String department, String staffName) {
        System.out.println("Get staff");

        Page<SdInformationDto> sdInformationDtos = sdService.getStaff(department, staffName);

        return sdInformationDtos;
    }

    @GetMapping("/get/staff/queryDetail")
    public String GetStaffDetail(@NotBlank(message = "員工編號不可為空") String staffList) {
        System.out.println("Get staff");
//        String result = sdService.getStaff();
//        System.out.println(result);
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
