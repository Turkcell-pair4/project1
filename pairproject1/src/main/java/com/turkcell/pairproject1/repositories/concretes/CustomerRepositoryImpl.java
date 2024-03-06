package com.example.odev.repositories.concretes;

import com.example.odev.entities.Customer;
import com.example.odev.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private List<Customer> customers = new ArrayList<>();
    @Override
    public Customer save(Customer customer) {
        customers.add(customer);
        return customer;
    }
    @Override
    public void deleteCustomer(int Id) {
        Customer customer = getCustomer(Id);
        customers.remove(customer);
    }
    @Override
    public void updateCustomer() {
        System.out.println("Customer updated");
    }
    @Override
    public Customer getCustomer(int Id) {
        for (Customer customer : customers) {
            if (customer.getId() == Id) {
                return customer;
            }
        }
        return null;
    }
    @Override
    public List<Customer> getCustomers() {
        return customers;
    }
}
