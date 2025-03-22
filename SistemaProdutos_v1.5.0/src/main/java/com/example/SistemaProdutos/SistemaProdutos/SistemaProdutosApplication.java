package com.example.SistemaProdutos.SistemaProdutos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class SistemaProdutosApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().load();
		System.setProperty("DATABASE_URL",dotenv.get("DOTENV_DATABASE_URL"));
		System.setProperty("DATABASE_USER",dotenv.get("DOTENV_DATABASE_USER"));
		System.setProperty("DATABASE_PASSWORD",dotenv.get("DOTENV_DATABASE_PASSWORD"));
		SpringApplication.run(SistemaProdutosApplication.class, args);
	}

}
