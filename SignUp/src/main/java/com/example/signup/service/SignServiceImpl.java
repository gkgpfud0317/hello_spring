package com.example.signup.service;

import com.example.signup.entity.SignRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignServiceImpl implements SignService {

    private final SignRepository repository;

    // 아이디 중복 확인
    public boolean checkuserIdDuplicate(String userId) {
        return repository.existsByuserId(userId);
    }

}
