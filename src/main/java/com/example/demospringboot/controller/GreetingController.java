package com.example.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class GreetingController {

    private String message="Hello world :)";

    @RequestMapping("/")
    public String welcome(Model model){
        model.addAttribute("message",this.message);
        return "index";
    }


}
