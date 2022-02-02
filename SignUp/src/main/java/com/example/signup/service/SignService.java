package com.example.signup.service;

public interface SignService {

    // 아이디 중복 확인
    boolean checkuserIdDuplicate(String userId);
}
