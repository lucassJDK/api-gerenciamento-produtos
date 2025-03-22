package com.example.SistemaProdutos.SistemaProdutos.infra;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.SistemaProdutos.SistemaProdutos.exceptions.*;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(ArgumentInvalidException.class)
    private ResponseEntity<RestError> userArgumentInvalidExeption(ArgumentInvalidException exception) {
        RestError restError = new RestError(HttpStatus.BAD_REQUEST, exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(restError);
    }

    @ExceptionHandler(ServerNotFoundException.class)
    public ResponseEntity<RestError> serverNotFoundException(ServerNotFoundException exeption) {
        RestError restError = new RestError(HttpStatus.NOT_FOUND, exeption.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(restError);
    }
    @ExceptionHandler(ListEmptyException.class)
    public ResponseEntity<RestError> listEmptyException(ListEmptyException exception) {
        RestError restError = new RestError(HttpStatus.EXPECTATION_FAILED, exception.getMessage());
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(restError);
}
    @ExceptionHandler(QueryEmptyException.class)
    public ResponseEntity<RestError> queryEmptyException(QueryEmptyException exception) {
        RestError restError = new RestError(HttpStatus.EXPECTATION_FAILED, exception.getMessage());
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(restError);
}
}