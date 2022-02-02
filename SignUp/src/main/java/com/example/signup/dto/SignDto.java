package com.example.signup.dto;

import com.sun.istack.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignDto {

    @NotBlank(message = "아이디를 입력해주세요.")
    @Size(min = 5, max = 10, message = "아이디는 5자 이상 10자 이하로 입력해주세요.")
    private String userId;

    @NotBlank(message = "이메일 주소를 입력해주세요.")
    @Email(message = "올바른 이메일 주소를 입력해주세요.")
    private String email;

    @NotBlank(message = "이름을 입력해주세요.")
    @Size(min = 6, max = 11, message = "이름은 6자 이상 11자 이하로 입력해주세요.")
    private String username;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    @Size(min = 7, max = 12, message = "비밀번호는 7자 이상 12자 이하로 입력해주세요.")
    private String password;

    @NotBlank(message = "태어난년도를 입력해주세요.")
    private String birth;

    @NotBlank(message = "성별을 선택하세요.")
    private String gender;

}
