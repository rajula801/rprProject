package com.rajula.rprproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class FirstController {
    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        return Map.of("message", "Hello from Java 17 on Azure AKS!", "status", "Healthy");
    }
}