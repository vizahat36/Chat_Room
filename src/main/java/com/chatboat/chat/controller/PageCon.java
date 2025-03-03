package com.chatboat.chat.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageCon {

    // This GET endpoint will serve the register.html template
    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Looks for src/main/resources/templates/register.html
    }

    // This GET endpoint will serve the login.html template
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Looks for src/main/resources/templates/login.html
    }

    // This GET endpoint will serve the home.html template
    @GetMapping("/")
    public String showHomePage() {
        return "home"; // Looks for src/main/resources/templates/home.html
    }
}

