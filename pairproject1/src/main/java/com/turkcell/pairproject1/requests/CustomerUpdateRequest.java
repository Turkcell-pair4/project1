package com.turkcell.pairproject1.requests;

import com.turkcell.pairproject1.entities.Order;

import java.util.List;

public record CustomerUpdateRequest(
        String name,
        String surname,
        String email,
        String password,
        String address,
        String phoneNumber,
        String gender,
        int basketId,
        int taxRate,
        List<Order> orders



) {
}
