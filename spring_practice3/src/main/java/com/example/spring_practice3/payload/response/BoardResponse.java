package com.example.spring_practice3.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class BoardResponse {

    private Integer id;
    private String title;
    private String content;

}
