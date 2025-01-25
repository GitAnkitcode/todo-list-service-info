package com.info.service.list.todo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.service.list.todo.model.Todo;
import com.info.service.list.todo.service.TodoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public Todo add(@RequestBody Todo todo) {
        return todoService.add(todo);
    }

    @GetMapping("/{id}")
    public Todo get(@PathVariable Long id) {
        return todoService.get(id);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody Todo todo) {
        return todoService.update(id, todo);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return todoService.delete(id);
    }

    @GetMapping
    public List<Todo> getAll() {
        return todoService.getAll();
    }

}
