package com.example.java2;

import com.example.java2.dto.ThreeUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class Java2ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("hello");
        try {
            var objectMapper = new ObjectMapper();

            // object -> text
            // object mapper get method 를 활용
            var ThreeUser = new ThreeUser("steve", 10, "010-1111-2222");
            var text = objectMapper.writeValueAsString(ThreeUser);
            System.out.println(text);


            // text -> object
            // object mapper 는 default 생성자를 필요를 함
            var objectUser = objectMapper.readValue(text, ThreeUser.class);
            System.out.println(objectUser);
        } catch (JsonProcessingException exception) {
            exception.printStackTrace();
        }
    }
}
