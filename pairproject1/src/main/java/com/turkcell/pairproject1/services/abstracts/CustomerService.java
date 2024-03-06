package com.example.odev.services.abstracts;

import com.example.odev.entities.Order;

import java.util.List;
public interface CustomerService {
    CustomerService createCustomer(CustomerService customer);
    CustomerService getCustomerById(int id);
    List<CustomerService> getAllCustomers();
    CustomerService updateCustomer(CustomerService customer);

    CustomerService deleteCustomer(int id);
}