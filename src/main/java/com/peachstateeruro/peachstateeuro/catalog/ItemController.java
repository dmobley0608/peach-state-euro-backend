package com.peachstateeruro.peachstateeuro.catalog;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/catalog")
public class ItemController {

    private ItemRepo repo;

    public ItemController(ItemRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public List<Item> getAllItems(){
        return repo.findAll();
    }
}
