package com.turkcell.pairproject1.controllers;
import com.turkcell.pairproject1.dtos.requests.OrderRequests.OrderSaveRequest;
import com.turkcell.pairproject1.dtos.requests.OrderRequests.OrderUpdateRequest;
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

    @PostMapping
    public Order createOrder(@RequestBody OrderSaveRequest request) {
        return orderService.save(request);
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable int id) {
        return orderService.findById(id);
    }

    @GetMapping
    public List<Order> findAll() {
        return orderService.findAll();
    }
}
