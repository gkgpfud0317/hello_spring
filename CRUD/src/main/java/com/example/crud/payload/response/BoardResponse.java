package com.example.crud.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class BoardResponse {

    private Integer id;
    private String title;
    private String content;
}
