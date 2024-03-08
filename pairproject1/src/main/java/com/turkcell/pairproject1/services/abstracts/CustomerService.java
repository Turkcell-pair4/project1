package com.turkcell.pairproject1.services.abstracts;

import com.turkcell.pairproject1.entities.Customer;

import java.util.List;
public interface CustomerService {
    Customer save(Customer customer);
    Customer findById(int id);
    List<Customer> findAll();
    Customer update(int id, Customer customer);
    void delete(int id);
}