package com.example.test.domain.user.service;

import com.example.test.domain.user.api.dto.request.SignupRequest;
import com.example.test.domain.user.domain.User;
import com.example.test.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 회원가입
    public void signup(SignupRequest request) {
        userRepository.save(User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build());
    }
}
