package com.example.test.domain.user.api;

import com.example.test.domain.user.api.dto.request.SignupRequest;
import com.example.test.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/signup")
    public void signup(@RequestBody SignupRequest request) {
        service.signup(request);
    }
}











}
