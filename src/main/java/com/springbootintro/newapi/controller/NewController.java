package com.springbootintro.newapi.controller;

import org.springframework.web.bind.annotation.*;

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

    //UC3- use GET request method & pass name as path variable
    //URL- http://localhost:8080/api/param/Dhani
    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name){
        return "Hello "+name+" from BridgeLabz";
    }

    //UC3- use POST request method
    //URL- http://localhost:8080/api/post (in postman- POST API)
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
