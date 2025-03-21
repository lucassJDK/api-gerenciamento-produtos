package com.example.SistemaProdutos.SistemaProdutos.exceptions;

public class QueryEmptyException extends RuntimeException{
    public QueryEmptyException() {super("O parâmetro não pode ser vazio!");}

    public QueryEmptyException(String message) {super(message);}
    
}
