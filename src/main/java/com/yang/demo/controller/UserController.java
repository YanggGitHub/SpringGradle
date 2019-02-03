package com.yang.demo.controller;
import com.yang.demo.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController

public class UserController {
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        return new User(id,"user@test.com", "testPassword");
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@Valid @RequestBody User user){
        return new User(12344, user.getEmail(), user.getPassword());

    }
    @GetMapping(value = "/users")
    public User getByEmail(@RequestParam("email") String email)
    {
        return new User(123, email, "testPassword");
    }
}
