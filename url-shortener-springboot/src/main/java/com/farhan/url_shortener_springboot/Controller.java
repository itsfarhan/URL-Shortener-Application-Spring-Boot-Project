package com.farhan.url_shortener_springboot;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.ui.Model;

import com.farhan.url_shortener_springboot.domain.entities.ShortUrl;
import com.farhan.url_shortener_springboot.domain.services.ShortUrlService;

@org.springframework.stereotype.Controller
public class Controller {
    private final ShortUrlService shortUrlService;

    
    public Controller(ShortUrlService shortUrlService) {
        this.shortUrlService = shortUrlService;
    }
    @GetMapping("/")
    public String home(Model model) {
        List <ShortUrl> shortUrls = shortUrlService.findAllPublicShortUrls();
        model.addAttribute("shortUrls", shortUrls);
        model.addAttribute("baseUrl", "http://localhost:8080");
        return "index";
    }
    // @GetMapping("/")
    // public String home(){//Model model) {
    //     //model.addAttribute("title", "URL Shortener - Thymeleaf");
    //     //model.addAttribute("currentPage", "home");
    //     return "index"; // Remove .html extension
    // }

    // @GetMapping("/about")
    // public String about(Model model) {
    //     //model.addAttribute("currentPage", "about");
    //     return "about"; // Remove .html extension
    // }
}


    

   