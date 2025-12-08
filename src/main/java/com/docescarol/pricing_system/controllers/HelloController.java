package com.docescarol.pricing_system.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
