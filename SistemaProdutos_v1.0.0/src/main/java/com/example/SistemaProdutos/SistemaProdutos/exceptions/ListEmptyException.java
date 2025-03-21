package com.example.SistemaProdutos.SistemaProdutos.exceptions;

public class ListEmptyException extends RuntimeException{
    public ListEmptyException() {super("Nenhum item foi encontrado!");}
    public ListEmptyException(String message) {super(message);}
}
