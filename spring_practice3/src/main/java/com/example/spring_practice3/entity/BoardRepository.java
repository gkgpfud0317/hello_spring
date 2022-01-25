package com.example.spring_practice3.entity;

import com.example.spring_practice3.payload.response.BoardResponseList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {
    List<BoardResponseList> findByUserId(Integer userId);
}
