package com.springBoot.myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// @RestContoller annotation also creates a spring Bean and keeps it in Spring IOC
// It achieves same result as @component annotation
// Scanning the class and creating it's object and keeping it in IOC Container
// At Last, once object is in IOC Container it is called Bean
@RestController
public class Car {

    //Autowired is used for Dependency Injection
    @Autowired
    public Dog dog;

    @GetMapping("/dog")
    public String fun(){
        dog.DogName="Rocky";
        return dog.fun()+" "+dog.DogName;
    }




}
