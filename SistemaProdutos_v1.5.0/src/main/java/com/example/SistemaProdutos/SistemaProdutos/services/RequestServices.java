package com.example.SistemaProdutos.SistemaProdutos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SistemaProdutos.SistemaProdutos.conditions.ConditionHandler;
import com.example.SistemaProdutos.SistemaProdutos.domains.Product;
import com.example.SistemaProdutos.SistemaProdutos.exceptions.ArgumentInvalidException;
import com.example.SistemaProdutos.SistemaProdutos.exceptions.ListEmptyException;
import com.example.SistemaProdutos.SistemaProdutos.repository.ProductsRepository;

@Service
public class RequestServices {
    @Autowired
    ProductsRepository repository;

    public String newProduct(Product product) {

        if(ConditionHandler.isAnyFieldNull(product)){
            throw new ArgumentInvalidException();
        }
        else if(ConditionHandler.isAnyFieldEmpty(product)){
            throw new ArgumentInvalidException();
        }
        repository.save(product);
        return "Produto cadastrado com sucesso!";
        };
    
    public List<Product> printRegisteredProducts() {

        if(ConditionHandler.repositoryIsEmpty(repository)) {
           throw new ListEmptyException();
        }
       return repository.findAll();
}

    public Optional<Product> printById(String id) {

        if(!repository.existsById(id)) {
            throw new ListEmptyException();
        }
        return repository.findById(id);

    }
       public String updateProduct(String id, Product newProduct) {

        if(!repository.existsById(id)) {
            throw new ListEmptyException();
        }
        repository.save(newProduct);
        return "Produto com id " + id + " atualizado com sucesso!";
        }

        public String deleteProduct(String id) {

            if(!repository.existsById(id)) {
                throw new ListEmptyException();
            }
            repository.deleteById(id);
            return "Produto com o id " + id + " deletado com sucesso!";
        }

}
