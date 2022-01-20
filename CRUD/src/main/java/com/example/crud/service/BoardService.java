package com.example.crud.service;

import com.example.crud.payload.request.BoardRequest;
import com.example.crud.payload.response.BoardResponse;

import java.util.List;

public interface BoardService {

    // 작성
    void create(BoardRequest request);

    // 삭제
    void delete(Integer id);

    // 수정
    void update(Integer id, BoardRequest request);

    // GET
    BoardResponse read(Integer id);

    // 리스트
    List<BoardResponse> list(int userId);
}
