package com.katacoda.katacodaproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

//    private String username;
    @GetMapping("/print")
    public String printHello(){
        return "Hello world!!";
    }

    @GetMapping("/{username}")
    public String printHello(@PathVariable("username") final String username){
        return "The user is "+username ;
    }

}
