package com.example.SistemaProdutos.SistemaProdutos.exceptions;


public class ArgumentInvalidException extends RuntimeException {

    
    public ArgumentInvalidException() {
        super("Argumento inválido inserido!");
    }

    public ArgumentInvalidException(String message) {
        super(message);
    }
}