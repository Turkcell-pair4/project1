package com.example.odev.repositories.abstracts;

import com.example.odev.entities.Seller;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository{
    // Additional custom query methods can be defined here if needed
    void save(Seller seller);
    void delete(Long Id);
    Seller get(Long Id);
    List<Seller> getAll();
}