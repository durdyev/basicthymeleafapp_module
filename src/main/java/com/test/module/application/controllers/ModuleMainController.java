package com.test.module.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModuleMainController {
    @RequestMapping("/module")
    String index(Model model) {
        model.addAttribute("text", "Hello, Module!");
        return "module/index";
    }
}
