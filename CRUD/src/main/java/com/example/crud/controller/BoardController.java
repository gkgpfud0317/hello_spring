package com.example.crud.controller;

import com.example.crud.entity.Board;
import com.example.crud.payload.request.BoardRequest;
import com.example.crud.service.BoardService;
import com.example.crud.service.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardServiceImpl service;

    // 작성
    @PostMapping("/write")
    public void create(@RequestBody BoardRequest request) {
        service.create(request);
    }
    // 삭제
    @DeleteMapping("/delete")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
