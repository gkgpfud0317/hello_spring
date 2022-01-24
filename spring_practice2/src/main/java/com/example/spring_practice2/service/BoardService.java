package com.example.spring_practice2.service;

import com.example.spring_practice2.payload.request.BoardRequest;
import com.example.spring_practice2.payload.response.BoardResponse;
import com.example.spring_practice2.payload.response.BoardResponseList;

import java.util.List;

public interface BoardService {

    // 작성
    void create(BoardRequest request);

    // 삭제
    void delete(Integer id);

    // 수정
    void update(BoardRequest request, Integer id);

    // GET
    BoardResponse read(Integer id);

    // List
    List<BoardResponseList> list(Integer userId);
}
