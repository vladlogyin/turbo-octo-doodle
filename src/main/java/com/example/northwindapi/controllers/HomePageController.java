package com.example.northwindapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
    // this works but I'm not sure why
    @RequestMapping("/")
    public String homePage() {
        return "index.html";
    }
}
