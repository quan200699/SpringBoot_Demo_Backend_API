package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> getAll();

    Product save(Product product);

    Optional<Product> findById(Long id);

    void remove(Long id);
}
