package com.example.SistemaProdutos.SistemaProdutos.conditions;

import com.example.SistemaProdutos.SistemaProdutos.domains.Product;
import com.example.SistemaProdutos.SistemaProdutos.repository.ProductsRepository;

public class ConditionHandler {
    public static boolean isAnyFieldNull(Product product) {

        if(product.getName() == null || product.getDescription() == null || product.getCategory() == null || product.getId() == null || Float.isNaN(product.getPrice())) {
            return true;
        }
        return false;
    }

public static boolean isAnyFieldEmpty(Product product) {

    if(product.getName().isEmpty() || product.getDescription().isEmpty() || product.getCategory().isEmpty() || product.getId().isEmpty()) {
        return true;
    }
    return false;
}
    
    public static boolean repositoryIsEmpty(ProductsRepository repository) {

        if(repository.count() == 0) {
            return true;
        }
        return false;
    }
}