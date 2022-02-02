package com.example.signup.controller;

import com.example.signup.service.SignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SignController {

    private final SignService service;

    // 아이디 중복 확인
    @GetMapping("/userId/{userId}/exists")
    public boolean checkuserIdDuplicate(@PathVariable String userId) {
        return service.checkuserIdDuplicate(userId);
    }
}
