package com.example.SistemaProdutos.SistemaProdutos.infra;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class RestError {
  private HttpStatus httpStatus;
  private String message;
}
