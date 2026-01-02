package com.rajula.rprproject.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // 1. Define the Logger
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String index() {
        // 2. Add log messages
        logger.info("API endpoint '/' was accessed at " + java.time.LocalDateTime.now());
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/test-log")
    public String testLog() {
        logger.warn("This is a WARNING log for Splunk testing!");
        logger.error("This is an ERROR log for Splunk testing!");
        return "Check your Splunk dashboard for logs!";
    }
}
