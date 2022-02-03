package com.example.signup.service;

public interface SignService {

    // 아이디 중복 확인
    boolean checkuserIdDuplicate(String userId);

    // 비밀번호 중복 확인
    boolean checkPasswordDuplicate(String password);
}
