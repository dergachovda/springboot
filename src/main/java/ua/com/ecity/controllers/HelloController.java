package ua.com.ecity.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Greetings from Spring Boot";
    }

    @RequestMapping("/another")
    public String another() {
        return "Another one";
    }
}
