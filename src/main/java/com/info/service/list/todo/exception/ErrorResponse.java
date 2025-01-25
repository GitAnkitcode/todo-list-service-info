package com.info.service.list.todo.exception;

public class ErrorResponse {
    private Long id;
    private String errorMessage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorResponse(Long id, String errorMessage) {
        this.id = id;
        this.errorMessage = errorMessage;
    }
}
