package com.info.service.list.todo.exception;

public class UserNotFoundException extends RuntimeException {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserNotFoundException(Long id) {
        this.id = id;
    }
}
