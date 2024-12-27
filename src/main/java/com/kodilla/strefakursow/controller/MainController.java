package com.kodilla.strefakursow.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String index(HttpServletResponse response) {
        response.addHeader("Spring", "is ok");
        System.out.println("index");
        return "Hello World";
    }
}
