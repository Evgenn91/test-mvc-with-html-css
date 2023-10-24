package com.github.Evgenn91.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String firstPage() {
//        model.addAttribute("name", name);
        return "index";
    }


    @GetMapping("/test")
    public String greeting() {
//        model.addAttribute("name", name);
        return "test";
    }

}
