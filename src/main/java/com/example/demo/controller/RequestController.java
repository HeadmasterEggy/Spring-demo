package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/SimpleParam")
    public String SimpleParam(HttpServletRequest request) {
        String name = requset.getParameter("name");

    }
}
