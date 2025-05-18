package com.security.springsecurity;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request) {
        return "Welcome to Spring Security, Session id : " +request.getSession().getId();
    }

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is public endpoint";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "This is user endpoint";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "This is admin endpoint";
    }
}
