package com.example.crud.service;

import com.example.crud.entity.Board;
import com.example.crud.entity.BoardRepository;
import com.example.crud.payload.request.BoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository repository;

    // 작성
    @Override
    public void create(BoardRequest request) {
        Board board = repository.save(Board.builder()
                .title(request.getTitle())
                .content(request.getTitle())
                .build());
    }

    // 삭제
    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
