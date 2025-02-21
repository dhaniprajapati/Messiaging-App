package com.springbootintro.newapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Base path for all endpoints
@RequestMapping("/api")
public class NewController {

    //UC1- use GET request method
    //URL- http://localhost:8080/api/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    //UC2- use GET request method & pass name as query
    //URL- http://localhost:8080/query?name=Dhani
    @GetMapping("/query")
    public String sayHelloName(@RequestParam String name){
        return "Hello "+name+" from BridgeLabz";
    }
}
