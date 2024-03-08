package com.turkcell.pairproject1.services.abstracts;

import com.turkcell.pairproject1.entities.Product;

import java.util.List;

public interface ProductService {
    Product findById(int id);
    List<Product> findAll();
    Product save(Product product);
    Product update(int id, Product product);
    void delete(int id);
}
