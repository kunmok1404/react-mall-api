package com.example.reactapi.repository.search;

import com.example.reactapi.domain.Todo;
import com.example.reactapi.dto.PageRequestDto;
import org.springframework.data.domain.Page;

public interface TodoSearch {

    Page<Todo> search1(PageRequestDto pageRequestDto);
}
