package com.example.odev.services.abstracts;

import com.example.odev.entities.Seller;

import java.util.List;

public interface SellerService {
    void createSeller(Seller seller);
    Seller getSellerById(Long id);
    List<Seller> getAllSellers();

}