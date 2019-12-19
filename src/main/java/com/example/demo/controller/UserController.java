package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.DateService;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
    
    private final DateService dateService;
    private final UserService userService;

    @GetMapping("/date")
    public String getDate() {
        return dateService.getDate().toString();
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAll();
    }
    
    @GetMapping("/mail-ru")
    public List<User> getMailRu() {
        return userService.getMailRu();
    }

}
