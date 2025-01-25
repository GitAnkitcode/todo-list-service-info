package com.info.service.list.todo.service;

import java.util.List;
import java.util.Optional;

import com.info.service.list.todo.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.service.list.todo.model.Todo;
import com.info.service.list.todo.repository.TodoRepository;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo add(Todo todo) {
       return todoRepository.save(todo);
    }

    public Todo get(Long id) {
        Optional<Todo> dysa = todoRepository.findById(id);
        if (dysa.isPresent()) {
           return dysa.get();
        } else {
           throw new UserNotFoundException(id);
        }
    }

    public String update(Long id, Todo todo) {
        Optional<Todo> opt = todoRepository.findById(id);
        if (opt.isPresent()) {
            Todo todoSaved = opt.get();
            todoSaved.setText(todo.getText());
            todoRepository.save(todoSaved);
            return "Update Successfully ";
        }
        throw new UserNotFoundException(id);
    }

    public String delete(Long id) {
        Optional<Todo> opt = todoRepository.findById(id);
        if (opt.isPresent()) {
            Todo todo = opt.get();
            todoRepository.deleteById(id);
            return "Delete Todo list";
        }

        throw new UserNotFoundException(id);
    }

    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

}
