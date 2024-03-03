package com.example.odev.repositories.abstracts;
import com.example.odev.entities.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository {
    void save(Order order);
    void delete(int Id);
    void update();
    Order get(int Id);
    List<Order> getAll();
}
