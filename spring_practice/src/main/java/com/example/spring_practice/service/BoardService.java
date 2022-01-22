package com.example.spring_practice.service;

import com.example.spring_practice.entity.Board;
import com.example.spring_practice.payload.request.BoardRequest;
import com.example.spring_practice.payload.response.BoardResponse;
import com.example.spring_practice.payload.response.BoardResponseList;

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

    // 리스트
    List<BoardResponseList> list(int userId);
}
