package com.example.crud.service;

import com.example.crud.dto.BoardRequest;
import com.example.crud.entity.Board;
import com.example.crud.entity.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // 의존성 주입
public class BoardService {

    private final BoardRepository repository;

    public void create(BoardRequest request) {
        Board board = Board.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();

        repository.save(board);
    }
}
