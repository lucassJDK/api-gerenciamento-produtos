package com.example.SistemaProdutos.SistemaProdutos.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    private String name;
    private float price;
    private String description;
    private String category;
    @Id
    private String id;
}
