package com.example.signup.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class SignEntity<B> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 아이디
    private String userId;

    // 유저이름
    private String username;

    // 비밀번호
    private String password;

    // 생년월일
    private String birth;

    // 성별
    private String gender;

    // email
    private String email;
}
