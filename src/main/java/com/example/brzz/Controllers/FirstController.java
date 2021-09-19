package com.example.brzz.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/index")
    public String home(){
        return "static/index";
    }
    @GetMapping("/users")
    public String users(){
        return "static/users";
    }
}
