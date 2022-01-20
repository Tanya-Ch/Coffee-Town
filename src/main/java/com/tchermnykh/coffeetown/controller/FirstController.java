package com.tchermnykh.coffeetown.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("title", "Main Page");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("about", "Chermnykh");
        return "about";
    }
}
