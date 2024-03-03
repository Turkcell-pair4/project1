package com.example.odev.services.abstracts;

import com.example.odev.entities.Order;

import java.util.List;
public interface OrderService {
    void createOrder(Order order);
    Order getOrderById(int id);
    List<Order> getAllOrders();
    // Other methods as needed
}