package com.personal.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
public class Person {

    @GetMapping("/greet")
    public String greet(){
        return "Hello world ";
    }
}
