package com.uniovi.sdi2324entrega1ext205.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//
//    @RequestMapping("/")
//    public String index() {
//        return "redirect:user/list";
//    }
//
//    @RequestMapping("/home")
//    public String home() {
//        return "redirect:user/list";
//    }
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        return "index";
    }
}
