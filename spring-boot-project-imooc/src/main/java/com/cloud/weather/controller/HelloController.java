package com.cloud.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author protry
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }
}
