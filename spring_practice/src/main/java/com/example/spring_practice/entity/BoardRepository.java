package com.example.spring_practice.entity;

import com.example.spring_practice.payload.response.BoardResponse;
import com.example.spring_practice.payload.response.BoardResponseList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {
    List<BoardResponseList> findByUserId(int userId);
}
