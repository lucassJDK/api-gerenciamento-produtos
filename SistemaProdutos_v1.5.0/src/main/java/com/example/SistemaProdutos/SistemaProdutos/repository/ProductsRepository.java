package com.example.SistemaProdutos.SistemaProdutos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SistemaProdutos.SistemaProdutos.domains.Product;
@Repository
public interface ProductsRepository extends JpaRepository<Product, String>{
    Optional<Product>findById(String id);
}
