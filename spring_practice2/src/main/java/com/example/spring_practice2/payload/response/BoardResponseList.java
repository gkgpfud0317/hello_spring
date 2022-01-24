package com.example.spring_practice2.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BoardResponseList {

    private Integer userId;

    private String title;

    private String content;
}
