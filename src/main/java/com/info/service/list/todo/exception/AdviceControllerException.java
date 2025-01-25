package com.info.service.list.todo.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdviceControllerException {

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> userNotFoundException(UserNotFoundException userNotFoundException) {
        Long userId = userNotFoundException.getId();
        return ResponseEntity.badRequest().body(new ErrorResponse(userId, "User not found with id : " + userId));
    }

}

