package com.example.SistemaProdutos.SistemaProdutos.exceptions;

public class ServerNotFoundException extends RuntimeException{

    public ServerNotFoundException() { super("Servidor não encontrado!"); }

    public ServerNotFoundException(String message) {  super(message); }
}
