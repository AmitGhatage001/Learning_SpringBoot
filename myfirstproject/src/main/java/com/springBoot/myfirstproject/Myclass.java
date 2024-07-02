package com.springBoot.myfirstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myclass {

    @GetMapping("/name")
    public String getname(){
        return "Amit Ghatage";
    }
}
