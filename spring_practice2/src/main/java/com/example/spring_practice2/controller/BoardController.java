package com.example.spring_practice2.controller;

import com.example.spring_practice2.payload.request.BoardRequest;
import com.example.spring_practice2.payload.response.BoardResponse;
import com.example.spring_practice2.payload.response.BoardResponseList;
import com.example.spring_practice2.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    // 작성
    @PostMapping("create")
    public void create(@RequestBody BoardRequest request) {
        service.create(request);
    }

    // 삭제
    @DeleteMapping("delete")
    public void delete(@Valid @PathVariable Integer id) {
        service.delete(id);
    }

    // 수정
    @PutMapping("update")
    public void update(@RequestBody BoardRequest request, @Valid @PathVariable Integer id) {
        service.update(request, id);
    }

    // GET
    @GetMapping("read")
    public BoardResponse read(@PathVariable Integer id) {
        return service.read(id);
    }

    // List
    @GetMapping("list")
    public List<BoardResponseList> list(@PathVariable Integer userId) {
        return service.list(userId);
    }

}
