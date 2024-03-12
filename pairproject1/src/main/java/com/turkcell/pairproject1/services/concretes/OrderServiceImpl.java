package com.turkcell.pairproject1.services.concretes;

import com.turkcell.pairproject1.entities.Order;
import com.turkcell.pairproject1.mappers.OrderMapper;
import com.turkcell.pairproject1.repositories.OrderRepository;
import com.turkcell.pairproject1.services.abstracts.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    // Implement the methods
    private final OrderRepository orderRepository;
    public OrderServiceImpl(OrderRepository orderRepository)
    {
        this.orderRepository = orderRepository;
    }


    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order findById(int id) {
        Optional<Order> order = orderRepository.findById(id);

        if(order.isEmpty()) {
            throw new RuntimeException("İlgili id'ye ait sipariş bulunamadı");
        }

        return order.get();
    }

    @Override
    public List<Order> findAll() {
        List<Order> orders = orderRepository.findAll();

        if(orders.isEmpty()){
            throw new RuntimeException("Sipariş bulunamadı");
        }

        return orders;
    }

    @Override
    public Order update(int id, OrderUpdateRequest request) {
        Optional<Order> order = orderRepository.findById(id);

        if(order.isEmpty()) {
            throw new RuntimeException("An order with the given id was not found.");
        }

        Order updatedOrder = order.get();
        OrderMapper.INSTANCE.updateOrderFields(updatedOrder, request);


        updatedOrder = orderRepository.save(updatedOrder);

        return updatedOrder;
    }

    @Override
    public void delete(int id) {
        Optional<Order> orderOptional = orderRepository.findById(id);
        if(orderOptional.isEmpty()) {
            throw new RuntimeException("İlgili Id'ye ait sipariş bulunamadı.");
        }
        orderRepository.delete(orderOptional.get());
    }
}
