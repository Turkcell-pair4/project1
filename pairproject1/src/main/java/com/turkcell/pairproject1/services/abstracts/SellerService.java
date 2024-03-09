package com.turkcell.pairproject1.services.abstracts;

import com.turkcell.pairproject1.dtos.requests.SellerRequests.SellerSaveRequest;
import com.turkcell.pairproject1.dtos.requests.SellerRequests.SellerUpdateRequest;
import com.turkcell.pairproject1.entities.Seller;
import org.springframework.stereotype.Service;
import com.turkcell.pairproject1.requests.*;
import java.util.List;

@Service
public interface SellerService {
    Seller save(Seller seller);
    Seller findById(int id);
    List<Seller> findAll();
    Seller update(int id, Seller seller);
    void delete(int id);

}