package com.example.WebApi.Reptile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebScraperController {
    @Autowired
    private WebScraperService scraperService;

    @GetMapping("/scrape")
    public String scrape(@RequestParam(name = "url", defaultValue = "0") String url) {
        System.out.println("in get scrape");
        return scraperService.scrapeWevsite(url);
    }

}
