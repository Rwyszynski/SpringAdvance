package com.kodilla.strefakursow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String index() {
        System.out.println("index");
        return "Hello World";
    }
}
