package com.example.spring_practice3.service;

import com.example.spring_practice3.entity.Board;
import com.example.spring_practice3.entity.BoardRepository;
import com.example.spring_practice3.payload.request.BoardRequest;
import com.example.spring_practice3.payload.response.BoardResponse;
import com.example.spring_practice3.payload.response.BoardResponseList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Controller
public class BoardServiceImpl implements BoardService {

    private final BoardRepository repository;

    // 작성
    @Override
    public void create(BoardRequest request) {
        Board board = repository.save(Board.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build());
    }

    // 삭제
    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    // 수정
    @Override
    public void update(BoardRequest request, Integer id) {
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

    // List
    @Override
    public List<BoardResponseList> list(Integer userId) {
        return repository.findByUserId(userId)
                .stream()
                .map(Board -> {
                    BoardResponseList responseList = BoardResponseList.builder()
                            .userId(Board.getUserId())
                            .title(Board.getTitle())
                            .content(Board.getContent())
                            .build();
                    return responseList;
                })
                .collect(Collectors.toList());
    }
}
