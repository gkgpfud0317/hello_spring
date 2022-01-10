package com.example.java2.controller;

import com.example.java2.dto.PageUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TwoApiController {


    // TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    // JSON
    @PostMapping("/json")
    public PageUser json(@RequestBody PageUser user) {
        return user; // 200 OK
    }

    // ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<PageUser> put(@RequestBody PageUser user) {
        return  ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
