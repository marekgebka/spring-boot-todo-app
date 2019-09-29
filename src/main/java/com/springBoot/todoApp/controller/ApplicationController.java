package com.springBoot.todoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
    @RequestMapping(value = "/")
    public String main(Model model) {
        model.addAttribute("name", "Todo-App");

        return "index";
    }
}
