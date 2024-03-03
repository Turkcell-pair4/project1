package com.turkcell.pairproject1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.turkcell.pairproject1.entities.Seller;
import com.turkcell.pairproject1.services.concretes.SellerServiceImpl;
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
