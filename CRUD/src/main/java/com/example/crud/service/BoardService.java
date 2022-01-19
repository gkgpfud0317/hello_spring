package com.example.crud.service;

import com.example.crud.payload.request.BoardRequest;

public interface BoardService {
    void create(BoardRequest request);
    void delete(Integer id);
}
