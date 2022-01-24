package com.example.spring_practice2.entity;

import com.example.spring_practice2.payload.request.BoardRequest;
import com.example.spring_practice2.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    public Board updateBoard(String title, String content) {
        this.title = title;
        this.content = content;

        return this;
    }
}
