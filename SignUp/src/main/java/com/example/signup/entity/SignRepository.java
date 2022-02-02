package com.example.signup.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SignRepository extends JpaRepository<Long, SignEntity> {

    // 아이디 중복 확인
    boolean existsByuserId(String userId);
}
