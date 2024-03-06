package com.example.odev.services.concretes;
import com.example.odev.services.abstracts.OrderService;
import com.example.odev.entities.Order;
import com.example.odev.repositories.concretes.OrderRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{
    // Implement the methods
    @Autowired
    private OrderRepositoryImpl orderRepository;
     public Order createOrder(Order order){
            return orderRepository.save(order);
     }


    public Order getOrderById(int id)
     {
            return orderRepository.get(id);
     }
     public List<Order> getAllOrders(){
            return orderRepository.getAll();
     }
}
