package com.turkcell.pairproject1.services.concretes;
import org.springframework.stereotype.Service;
import com.turkcell.pairproject1.entities.Customer;
import com.turkcell.pairproject1.repositories.CustomerRepository;
import com.turkcell.pairproject1.services.abstracts.CustomerService;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;


    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }



    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findById(int id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if(customerOptional.isEmpty()) {
            throw new RuntimeException("Customer with id " + id + " does not exist");
        }

        return customerOptional.get();
    }

    public List<Customer> findAll() {
        List<Customer> customers = customerRepository.findAll();

        if(customers.isEmpty()) {
            throw new RuntimeException("There are no customers");
        }

        return customers;
    }

    public Customer update(int id, Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findById(id);

        if(customerOptional.isEmpty()) {
            throw new RuntimeException("Customer with id " + id + " does not exist");
        }

        Customer customerToUpdate = customerOptional.get();
        customerToUpdate = customerRepository.save(customer);

        return customerToUpdate;

    }

    @Override
    public void delete(int id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if(customerOptional.isEmpty()) {
            throw new RuntimeException("Customer with id " + id + " does not exist");
        }

        customerRepository.delete(customerOptional.get());
    }


}
