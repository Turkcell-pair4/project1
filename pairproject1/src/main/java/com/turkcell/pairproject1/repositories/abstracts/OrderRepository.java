package com.turkcell.pairproject1.repositories.abstracts;
import com.turkcell.pairproject1.entities.Order;
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
