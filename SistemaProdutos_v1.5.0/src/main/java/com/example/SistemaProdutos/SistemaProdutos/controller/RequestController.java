package com.example.SistemaProdutos.SistemaProdutos.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.SistemaProdutos.SistemaProdutos.domains.Product;
import com.example.SistemaProdutos.SistemaProdutos.exceptions.QueryEmptyException;
import com.example.SistemaProdutos.SistemaProdutos.services.RequestServices;

@RestController
@RequestMapping("/produtos")
public class RequestController {
    @Autowired
    private RequestServices requestService;

    @PostMapping("/adicionar")
    
    public String newProduct(@RequestBody Product product) {
        requestService.newProduct(product);
        return "Produto cadastrado com sucesso!";
    }

    @GetMapping("/listarTodos")
    public List<Product> printProducts() {
    return requestService.printRegisteredProducts();
    }

    @GetMapping("/listarPorId")
    public Optional<Product> printById(@RequestParam(value="id",defaultValue = "bxa8lza!?")String id) {

        if(id.equals("bxa8lza!?")) {
            throw new QueryEmptyException();
        }
        return requestService.printById(id);
    }
    
    @PutMapping("/atualizar")
    public String updateProduct(@RequestParam(value="id",defaultValue = "bxa8lza!?")String id, @RequestBody Product newProduct) {

        if(id.equals("bxa8lza!?")) {
            throw new QueryEmptyException();
        }
        return requestService.updateProduct(id,newProduct);
    }

    @DeleteMapping("/deletar")
    public String deleteProduct(@RequestParam(value="id",defaultValue = "bxa8lza!?")String id) {
        if(id.equals("bxa8lza!?")) {
            throw new QueryEmptyException();
        }
        return requestService.deleteProduct(id);
    }

    
}
