package com.example.SistemaProdutos.SistemaProdutos.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.SistemaProdutos.SistemaProdutos.domains.Product;
import com.example.SistemaProdutos.SistemaProdutos.exceptions.ArgumentInvalidException;
import com.example.SistemaProdutos.SistemaProdutos.exceptions.ListEmptyException;

@Service
public class RequestServices {
    
    static ArrayList<Product> products = new ArrayList<>();

    public String newProduct(Product product) {

        if(product.getName() == null || product.getDescription() == null || product.getCategory() == null || Float.isNaN(product.getPrice()) || product.getId() == null){
            throw new ArgumentInvalidException();
        }
        else if(product.getName().isEmpty() || product.getDescription().isEmpty() || product.getCategory().isEmpty() || product.getId().isEmpty()) {
            throw new ArgumentInvalidException();
        }
        products.add(product);
        return "Produto cadastrado com sucesso!";
    }

    public ArrayList<Product> PrintRegisteredProducts() {

        if(products.isEmpty()) {
           throw new ListEmptyException();
        }

        return products;
}

    public ArrayList<Product> printById(String id) {
        ArrayList<Product> productsById = new ArrayList<Product>();

         for(Product product : products) {
            if(product.getId().equals(id)) {
                productsById.add(product);
            }
         }
            if(productsById.isEmpty()) {
             throw new ListEmptyException();
            }
         return productsById;
    }
       public ArrayList<Product> updateProduct(String id, Product newProduct) {

        for(Product productsRegistered:products) {
            if(productsRegistered.getId().equals(id)) {
                productsRegistered.setName(newProduct.getName());
                productsRegistered.setPrice(newProduct.getPrice());
                productsRegistered.setDescription(newProduct.getDescription());
            }
        }
        return products;
        }

        public String deleteProduct(String id) {

            for(Product productsRegistered:products) {

                if(productsRegistered.getId().equals(id)) {
                    System.out.println("Produto " + productsRegistered.getName() + " deletado");
                    products.remove(productsRegistered);
                }
            }
            return "Produtos com o id " + id + " deletado com sucesso!";
        }

}
