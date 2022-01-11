package com.example.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor //  파라미터가 없는 기본 생성자를 생성
@AllArgsConstructor //  모든 필드 값을 파라미터로 받는 생성자를 만듦
@Getter
@Builder // 자동으로 해당 클래스에 빌더를 추가
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;
}
