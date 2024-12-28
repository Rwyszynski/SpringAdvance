package com.kodilla.strefakursow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;

@RestController
public class MainController {

    @RequestMapping("/")
    public String index(HttpServletResponse response) {
        response.addHeader("Spring", "is ok");
        System.out.println("index");
        return "Hello World";
    }
}
