package com.turkcell.pairproject1.controllers;

import com.turkcell.pairproject1.services.abstracts.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.turkcell.pairproject1.entities.Seller;
import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {
    private final SellerService sellerService;

    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @PostMapping("/create")
    public Seller createSeller(@RequestBody Seller seller) {
        return sellerService.save(seller);
    }

    @GetMapping("/{id}")
    public Seller getSellerById(@PathVariable int id) {
        return sellerService.findById(id);
    }

    @GetMapping("/all")
    public List<Seller> getAllSellers() {
        return sellerService.findAll();
    }
}
