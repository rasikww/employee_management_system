package edu.icet.demo.controller;

import edu.icet.demo.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
        return false;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return "";
    }
}
