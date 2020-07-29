package com.roberto.desafio.repository;

import com.roberto.desafio.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository <Product, String> {
}
