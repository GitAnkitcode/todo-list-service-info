package com.info.service.list.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.service.list.todo.model.Todo;
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
