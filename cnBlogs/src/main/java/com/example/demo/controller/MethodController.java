package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/met")
public class MethodController {

    @GetMapping("/people/{pid}/animal/{aid}")
    public String method1(@PathVariable String pid ,
                          @PathVariable("aid") String animalId){
        return "用户ID: "+pid+"animalID: "+animalId;
    }
}
