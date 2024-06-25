package com.example.reactapi.repository;

import com.example.reactapi.domain.Todo;
import com.example.reactapi.repository.search.TodoSearch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>, TodoSearch {
}
