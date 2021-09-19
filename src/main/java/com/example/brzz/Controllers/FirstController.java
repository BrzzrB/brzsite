package com.example.brzz.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("users")
    public String users(){
        return "users";
    }
}
