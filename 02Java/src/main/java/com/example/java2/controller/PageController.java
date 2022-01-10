package com.example.java2.controller;

import com.example.java2.dto.PageUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    // ResponseEntity

    @ResponseBody
    @GetMapping("/user")
    public PageUser user() {
        var user = new PageUser();
        user.setName("linda");
        user.setAddress("산성동");
        return user;
    }
}
