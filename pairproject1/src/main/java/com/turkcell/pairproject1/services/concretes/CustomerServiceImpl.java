package com.turkcell.pairproject1.services.concretes;
import com.turkcell.pairproject1.dtos.requests.CustomerRequests.CustomerSaveRequest;
import com.turkcell.pairproject1.dtos.requests.CustomerRequests.CustomerUpdateRequest;
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



    public Customer save(CustomerSaveRequest request) {
        Customer customer = CustomerMapper.INSTANCE.convertToCustomer(request);

        customer = customerRepository.save(customer);

        return customer;
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

    public Customer update(int id, CustomerUpdateRequest request) {
        Customer customer = findById(id);

        customer.setId(request.id());
        customer.setName(request.name());
        customer.setSurname(request.surname());
        customer.setAddress(request.address());
        customer.setEmail(request.email());
        customer.setGender(request.gender());
        customer.setPhoneNumber(request.phoneNumber());
        customer.setPassword(request.password());
        customer.setBasket(request.basket());

        return customer;

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
