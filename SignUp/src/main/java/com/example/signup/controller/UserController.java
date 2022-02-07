package com.example.signup.controller;

import com.example.signup.service.SignServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final SignServiceImpl service;

    // 아이디 중복 확인
    @GetMapping("/userId/{userId}/exists")
    public boolean checkuserIdDuplicate(@PathVariable String username) {
        return service.checkuserIdDuplicate(username);
    }

    // 비밀번호 중복 확인
    @GetMapping("/password/{password}/exists")
    public boolean checkPasswordDuplicate(@PathVariable String password) {
        return service.checkPasswordDuplicate(password);
    }
}
