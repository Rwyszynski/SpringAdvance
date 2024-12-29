package com.kodilla.strefakursow.controller;

import com.kodilla.strefakursow.entity.Item;
import com.kodilla.strefakursow.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    ItemService itemService;

    @RequestMapping("/")
    public List<Item> index(HttpServletResponse response) {
        return itemService.getItemsWithQuantityOverTwenty();
    }

    @RequestMapping("/quantity_treshold")
    public List<Item> quantityTreshold(@RequestParam(name="quantity") int quantity) {
        return itemService.getItemsWithQuantityOver(quantity);
    }

    @RequestMapping("/find_by_name")
    public List<Item> findByName() {
        String regexName="s%";
        List<Item> result = itemService.getItemsWithNameLike(regexName);
        return result;
    }
}
