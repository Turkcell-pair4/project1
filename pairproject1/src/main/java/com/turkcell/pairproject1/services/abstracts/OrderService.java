package com.turkcell.pairproject1.services.abstracts;

import com.turkcell.pairproject1.entities.Order;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrderService {
    Order save(Order order);
    Order findById(int id);
    List<Order> findAll();
    Order update(int id, Order order);
    void delete(int id);
}
