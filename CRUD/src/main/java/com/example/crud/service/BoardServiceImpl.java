package com.example.crud.service;

import com.example.crud.entity.Board;
import com.example.crud.entity.BoardRepository;
import com.example.crud.payload.request.BoardRequest;
import com.example.crud.payload.response.BoardResponse;
import com.example.crud.payload.response.BoardResponseList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    // 수정
    @Override
    public void update(Integer id, BoardRequest request) {
        Board board = repository.findById(id)
                .map(newBoard -> newBoard.updateBoard(
                        request.getTitle(),
                        request.getContent()
                ))
                .orElseThrow(() -> new RuntimeException());
    }

    // GET
    @Override
    public BoardResponse read(Integer id) {
        return repository.findById(id)
                .map(Board -> {
                    BoardResponse response = BoardResponse.builder()
                            .id(Board.getId())
                            .title(Board.getTitle())
                            .content(Board.getContent())
                            .build();
                    return response;
                })
                .orElseThrow(() -> new RuntimeException());
    }
    // 리스트
    @Override
    public List<BoardResponseList> list(int userId) {
        return repository.findByUserId(userId)
                .stream()
                .map(Board -> {
                    BoardResponseList responseList = BoardResponseList.builder()
                            .userId(Board.getId())
                            .content(Board.getContent())
                            .title(Board.getTitle())
                            .build();
                    return responseList;
                })
                .collect(Collectors.toList());
    }

}
