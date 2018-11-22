package com.test.module.application.controllers.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/module")
public class MainModuleRestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, from module";
    }
}
