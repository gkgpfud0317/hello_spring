package com.example.crud.controller;

import com.example.crud.dto.BoardRequest;
import com.example.crud.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor // 의존성 주입
public class BoardController {

    private final BoardService service;

    @PostMapping("/create")
    public void create(@RequestBody BoardRequest request) {
        service.create(request);
    }
}
