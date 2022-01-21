package com.example.crud.payload.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BoardResponseList {

    private int userId;
    private String content;
    private String title;
}
