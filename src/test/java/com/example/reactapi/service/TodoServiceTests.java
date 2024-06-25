package com.example.reactapi.service;

import com.example.reactapi.dto.PageRequestDto;
import com.example.reactapi.dto.PageResponseDto;
import com.example.reactapi.dto.TodoDto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@Log4j2
@SpringBootTest
public class TodoServiceTests {

    @Autowired
    private TodoService todoService;

    @Test
    void testGet() {
        Long tno = 1L;
        log.info(todoService.get(tno));
    }

    @Test
    void testRegist() {
        TodoDto todoDto = TodoDto.builder()
                .title("제목111111")
                .content("content111111")
                .dueDate(LocalDate.of(2024,6,22))
                .build();
        log.info(todoService.register(todoDto));
    }

    @Test
    void testList() {
        PageRequestDto pageRequestDto = PageRequestDto.builder().build();
        log.info(todoService.getList(pageRequestDto));
    }
}
