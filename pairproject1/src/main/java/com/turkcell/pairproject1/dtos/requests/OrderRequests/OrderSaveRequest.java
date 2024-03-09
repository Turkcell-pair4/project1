package com.turkcell.pairproject1.dtos.requests.OrderRequests;
import com.turkcell.pairproject1.entities.Customer;
import com.turkcell.pairproject1.entities.Product;
import com.turkcell.pairproject1.entities.Seller;

public record OrderSaveRequest(
        Customer customer,
        Product product,
        int quantity,
        double price,
        String address,
        String paymentMethod,
        Seller seller

) {}
