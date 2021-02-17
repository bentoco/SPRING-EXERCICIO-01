package com.ayty.controller;

import com.ayty.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")

public class ConsumerController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String status(){
        return "online";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user){
        return user;
    }
}
