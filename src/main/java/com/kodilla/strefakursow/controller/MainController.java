package com.kodilla.strefakursow.controller;

import com.kodilla.strefakursow.entity.Item;
import com.kodilla.strefakursow.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;

@RestController
public class MainController {

    @Autowired
    ItemService itemService;

    @RequestMapping("/")
    public String index(HttpServletResponse response) {
        response.addHeader("Spring", "is ok");

        Item item = new Item();
        item.setName("Drone");
        item.setPrice("1000$");
        itemService.saveItem(item);

        return "Hello World";
    }
}
