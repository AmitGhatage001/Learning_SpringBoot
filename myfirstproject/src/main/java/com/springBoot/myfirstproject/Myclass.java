package com.springBoot.myfirstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Myclass {

    @GetMapping("/name")
    public String getname(){

        return "Amit Ghatage";
    }

    @GetMapping("/array")
    public int[] getArray(){
        int[] arr = {1,23,45,565};
        return arr;
    }

    @GetMapping("/boolean")
    public boolean getBoolean(){
        return true;
    }

    @GetMapping("/list")
    public ArrayList<String> getList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Charlie");
        list.add("Echo");
        list.add("Foxtrot");
        list.add("Gambit");

        return list;
    }
}
