package com.example.springboot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @PutMapping("/hello/{firstName}")
    public String sayHello(
            @PathVariable String firstName,
            @RequestParam String lastName) {

        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}