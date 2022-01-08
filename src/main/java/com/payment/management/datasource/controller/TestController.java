package com.payment.management.datasource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test: " + LocalDateTime.now();
    }
}
