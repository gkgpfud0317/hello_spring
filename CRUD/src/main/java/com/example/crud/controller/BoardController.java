package com.example.crud.controller;

import com.example.crud.payload.request.BoardRequest;
import com.example.crud.payload.response.BoardResponse;
import com.example.crud.service.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardServiceImpl service;

    // 작성
    @PostMapping("/write")
    public void create(@Valid @RequestBody BoardRequest request) {
        service.create(request);
    }
    // 삭제
    @DeleteMapping("/delete")
    public void delete(@Valid @PathVariable Integer id) {
        service.delete(id);
    }

    // 수정
    @PutMapping("/update")
    public void update(@Valid @PathVariable Integer id, @RequestBody BoardRequest request) {
        service.update(id, request);
    }

    // GET
    @GetMapping("/read")
    public BoardResponse read(@PathVariable Integer id) {
        return service.read(id);
    }

    // 리스트
    @GetMapping("/list")
    public List<BoardResponse> list(@PathVariable int userId) {
        return service.list(userId);
    }

}
