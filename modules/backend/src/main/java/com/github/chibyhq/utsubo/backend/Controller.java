package com.github.chibyhq.utsubo.backend;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/greeting")
    public String foo() {
        return "Hello from tomcat";
    }
    
}