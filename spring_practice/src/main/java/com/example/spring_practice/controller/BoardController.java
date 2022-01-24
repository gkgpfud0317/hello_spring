package com.example.spring_practice.controller;

import com.example.spring_practice.entity.Board;
import com.example.spring_practice.entity.BoardRepository;
import com.example.spring_practice.payload.request.BoardRequest;
import com.example.spring_practice.payload.response.BoardResponse;
import com.example.spring_practice.payload.response.BoardResponseList;
import com.example.spring_practice.service.BoardService;
import com.example.spring_practice.service.BoardServiceImpl;
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
    public void update(@Valid @RequestBody BoardRequest request, @PathVariable Integer id) {
        service.update(request, id);
    }

    // GET
    @GetMapping("/read")
    public BoardResponse read(@PathVariable Integer id) {
        return service.read(id);
    }

    // 리스트
    @GetMapping("/list")
    public List<BoardResponseList> list(@PathVariable int userId) {
        return service.list(userId);
    }

}
