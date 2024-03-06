package com.example.odev.repositories.abstracts;
import com.example.odev.entities.Order;
import java.util.List;
public interface OrderRepository {
    Order save(Order order);
    void delete(int Id);
    void update();
    Order get(int Id);
    List<Order> getAll();
}
