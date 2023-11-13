package com.example.WebApi.Reptile;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WebScraperService {
    public String scrapeWevsite(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
//            System.out.println("doc:" + doc);
            String title = doc.title();
            Elements articleElement = doc.select("div.caas-figure > p");
            if (articleElement != null) {
                return articleElement.text();
            }
            System.out.println("url:" + url);
            System.out.println("title:" + title);
//            System.out.println("content:" + articleElement);
            return "title";
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
