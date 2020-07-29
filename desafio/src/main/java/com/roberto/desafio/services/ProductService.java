package com.roberto.desafio.services;

import com.roberto.desafio.model.Product;
import com.roberto.desafio.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Boolean uploadProduct(Product product){
        this.repository.save(product);
        return true;
    }
}
