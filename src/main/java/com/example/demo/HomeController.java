package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "index";
    }
    @RequestMapping("/CrabCake")
    public String crabPage(){
        return "CrabCake";
    }
    @RequestMapping("/ApplePie")
    public String ApplePage(){
        return "ApplePie";
    }
    @RequestMapping("/Kimchi")
    public String KimchiPage(){
        return "Kimchi";
    }
    @RequestMapping("/bootstrap")
    public String bootstrap(){
        return "bootstrap";
    }
}
