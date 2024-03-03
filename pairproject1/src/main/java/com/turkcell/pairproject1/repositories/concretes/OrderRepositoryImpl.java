package com.turkcell.pairproject1.repositories.concretes;
import com.turkcell.pairproject1.repositories.abstracts.OrderRepository;
import com.turkcell.pairproject1.entities.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private List<Order> orders;
    Order a = new Order(5);
    public OrderRepositoryImpl() {
        orders = new ArrayList<>();
    }

    public void save(Order order) {
        orders.add(order);
    }
    public void delete(int Id) {

    }
    public void update() {

    }
    public Order get(int Id) {
        return null;
    }
    public List<Order> getAll() {
        return orders;
    }

}
