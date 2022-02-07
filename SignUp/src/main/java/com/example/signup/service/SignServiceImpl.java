package com.example.signup.service;

import com.example.signup.dto.SignDto;
import com.example.signup.entity.SignEntity;
import com.example.signup.entity.SignRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
// Rollback 할 수 있도록 안전장치
@Transactional(readOnly = true)
public class SignServiceImpl implements SignService {

    private final SignRepository repository;

    // 아이디 중복 확인
    public boolean checkuserIdDuplicate(String username) {
        return repository.existsByUsername(username);
    }

    // 비밀번호 중복 확인
    public boolean checkPasswordDuplicate(String password) {
        return repository.existsByPassword(password);
    }

    // db save
    public Long createUser(SignDto dto) {
        SignEntity signEntity = form.entity();
        SignRepository.save(signEntity);
        return signEntity.getId();
    }

}
