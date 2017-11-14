package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/index")
    public String welcome(Model model){
        model.addAttribute("msg", "Hello World");
        return "Hello";
    }
}
