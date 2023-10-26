package com.github.Evgenn91.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    @GetMapping("/")
    public String firstPage(Model model) {
        model.addAttribute("name", "Тестовое имя");
        return "index";
    }


    @GetMapping("/test")
    public String greeting(Model model) {
//        model.addAttribute("name", name);
        return "test";
    }

}
