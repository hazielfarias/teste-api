package com.roberto.desafio.controller;

import com.roberto.desafio.model.Product;
import com.roberto.desafio.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Controller {

    @Autowired
    private ProductService service;
    @GetMapping("/local")
    public String teste(){
        return "Success!";
    }

    @GetMapping("/upload")
    public String uploadProduct(){
        Product product = new Product("1","car", 25000.00, 5000.00, 1, new Date());

        service.uploadProduct(product);
        return "Success!";
    }
}
