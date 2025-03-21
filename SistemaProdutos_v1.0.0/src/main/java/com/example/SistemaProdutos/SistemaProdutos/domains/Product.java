package com.example.SistemaProdutos.SistemaProdutos.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Product {
    private String name;
    private float price;
    private String description;
    private String category;
    private String id;
}
