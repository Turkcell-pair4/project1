package com.turkcell.pairproject1.controllers;
import com.turkcell.pairproject1.entities.Order;
import com.turkcell.pairproject1.services.abstracts.OrderService;
import com.turkcell.pairproject1.services.concretes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable int id) {
        return orderService.findById(id);
    }

    @GetMapping("/all")
    public List<Order> findAll() {
        return orderService.findAll();
    }
}
