package com.example.reactapi.controller;

import com.example.reactapi.dto.PageRequestDto;
import com.example.reactapi.dto.PageResponseDto;
import com.example.reactapi.dto.TodoDto;
import com.example.reactapi.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/api/todo")
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/{tno}")
    public TodoDto get(@PathVariable("tno") Long tno) {
        return todoService.get(tno);
    }

    @GetMapping("/list")
    public PageResponseDto<TodoDto> list(PageRequestDto pageRequestDto) {
        return todoService.getList(pageRequestDto);
    }

    @PostMapping
    public Map<String,Long> register(@RequestBody TodoDto dto) {
        Long tno = todoService.register(dto);
        return Map.of("TNO", tno);
    }

    @PutMapping("/{tno}")
    public Map<String,String> modify(@PathVariable("tno") Long tno, @RequestBody TodoDto dto) {
        dto.setTno(tno);
        todoService.modify(dto);
        return Map.of("RESULT", "SUCCESS");
    }

    @DeleteMapping("/{tno}")
    public Map<String,String> remove(@PathVariable("tno") Long tno) {
        todoService.remove(tno);
        return Map.of("RESULT", "SUCCESS");
    }
}
