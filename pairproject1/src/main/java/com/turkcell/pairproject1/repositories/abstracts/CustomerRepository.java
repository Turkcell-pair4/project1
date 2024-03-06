package com.example.odev.repositories.abstracts;


public interface CustomerRepository {
    Customer save(Customer customer);

    void deleteCustomer(int Id);

    void updateCustomer();

    Customer getCustomer(int Id);

    List<Customer> getCustomers();
}