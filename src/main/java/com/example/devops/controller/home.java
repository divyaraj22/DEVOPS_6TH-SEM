package com.example.devops.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/")
    public String showMassage(){
        return "20it030";
    }
}
