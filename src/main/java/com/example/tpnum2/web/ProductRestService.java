package com.example.tpnum2.web;

import com.example.tpnum2.entities.Product;
import com.example.tpnum2.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
    private ProductRepository productRepository;


@GetMapping("/products/{id}")
    public Product findproduct(@PathVariable Long id){
        Product product = productRepository.findById(id).orElse(null);
        return product;
    }
}
