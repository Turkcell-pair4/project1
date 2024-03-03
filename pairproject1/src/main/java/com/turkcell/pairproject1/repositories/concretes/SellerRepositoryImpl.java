package com.example.odev.repositories.concretes;
import com.example.odev.repositories.abstracts.SellerRepository;
import com.example.odev.entities.Seller;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
@Repository
public class SellerRepositoryImpl implements SellerRepository {
    // Implement the method
    private List<Seller> sellers;
public SellerRepositoryImpl() {
        sellers = new ArrayList<>();
}

    public void save(Seller seller) {
        sellers.add(seller);
    }
    public void delete(Long Id) {
    }
    public Seller get(Long Id) {
        for(Seller seller : sellers) {
            if (Objects.equals(seller.getId(), Id)) {
                return seller;
            }
        }
        return null;
    }
    public List<Seller> getAll() {
        return sellers;
    }
}
