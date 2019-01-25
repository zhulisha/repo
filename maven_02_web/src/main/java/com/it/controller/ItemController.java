package com.it.controller;

import com.it.domain.Item;
import com.it.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/findById")
    public String findById(Model model){
        Item item = itemService.findById(1);
        System.out.println(item);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
