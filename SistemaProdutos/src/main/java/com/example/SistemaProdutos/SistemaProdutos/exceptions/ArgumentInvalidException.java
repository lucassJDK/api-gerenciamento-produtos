package com.example.SistemaProdutos.SistemaProdutos.exceptions;


public class ArgumentInvalidException extends RuntimeException {

    
    public ArgumentInvalidException() {
        super("Invalid argument provided.");
    }

    public ArgumentInvalidException(String message) {
        super(message);
    }
}