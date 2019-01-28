package com.springboot.example.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable(value="name") String name) {
        return "hello "+ name + "";
    }
}

