package com.example.brzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class BrzzApplication {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "home";
    }

    public static void main(String[] args) {
        SpringApplication.run(BrzzApplication.class, args);
    }
}