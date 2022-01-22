package com.example.spring_practice.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BoardResponseList {

    private int userId;

    private String title;

    private String content;

}
