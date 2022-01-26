package com.example.spring_practice3.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {
    default List<Board> findByUserId(int userId) {
        return null;
    }
}
