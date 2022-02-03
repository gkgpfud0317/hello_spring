package com.example.signup.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SignRepository extends JpaRepository<SignEntity, Long> {

    // 아이디 중복 확인
    boolean existsByuserId(String userId);

    // 비밀번호 중복 확인
    boolean existsByPassword(String password);
}
