package com.turkcell.pairproject1.services.abstracts;

import com.turkcell.pairproject1.entities.Order;

import java.util.List;
public interface OrderService {
    void createOrder(Order order);
    Order getOrderById(int id);
    List<Order> getAllOrders();
    // Other methods as needed
}
