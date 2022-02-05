package com.example.signup.dto;

import com.example.signup.entity.SignEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignDto {

    @NotBlank(message = "이름을 입력해주세요.")
    @Size(min = 6, max = 11, message = "이름은 6자 이상 11자 이하로 입력해주세요.")
    private String username;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    @Size(min = 7, max = 12, message = "비밀번호는 7자 이상 12자 이하로 입력해주세요.")
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 비밀번호 암호화
    public SignEntity toEntity() {
        return SignEntity.builder()
                .username(username)
                .password(new BCryptPasswordEncoder().encode(password))
                .build();
    }
}

