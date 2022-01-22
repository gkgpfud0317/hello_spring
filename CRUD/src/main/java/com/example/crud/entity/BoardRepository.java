package com.example.crud.entity;

import com.example.crud.payload.response.BoardResponse;
import com.example.crud.payload.response.BoardResponseList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {
    List<BoardResponseList> findByUserId(int userId);
}
