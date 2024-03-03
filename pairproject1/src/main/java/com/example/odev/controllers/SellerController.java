package com.example.odev.controllers;

import com.example.odev.entities.Seller;
import com.example.odev.services.concretes.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerServiceImpl sellerService;

    @PostMapping("/create")
    public void createSeller(@RequestBody Seller seller) {
        sellerService.createSeller(seller);
    }

    @GetMapping("/{id}")
    public Seller getSellerById(@PathVariable Long id) {
        return sellerService.getSellerById(id);
    }

    @GetMapping("/all")
    public List<Seller> getAllSellers() {
        return sellerService.getAllSellers();
    }
}