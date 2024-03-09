package com.turkcell.pairproject1.services.abstracts;

import com.turkcell.pairproject1.dtos.requests.CustomerRequests.CustomerSaveRequest;
import com.turkcell.pairproject1.dtos.requests.CustomerRequests.CustomerUpdateRequest;
import com.turkcell.pairproject1.entities.Customer;

import java.util.List;
public interface CustomerService {
    Customer save(CustomerSaveRequest request);
    Customer findById(int id);
    List<Customer> findAll();
    Customer update(int id, CustomerUpdateRequest request);
    void delete(int id);
}