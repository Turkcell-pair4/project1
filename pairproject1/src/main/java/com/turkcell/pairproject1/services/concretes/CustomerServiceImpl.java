package com.example.odev.services.concretes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.odev.entities.Customer;
import com.example.odev.repositories.CustomerRepository;
import com.example.odev.services.CustomerService;
import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerService customerService;

    @Override
    public CustomerService createCustomer(CustomerService customer) {
        return customerService.save(customer);
    }

    @Override
    public CustomerService getCustomerById(int id) {
        return customerService.getCustomer(id);
    }

    @Override
    public List<CustomerService> getAllCustomers() {
        return customerService.getCustomers();
    }

    @Override
    public CustomerService updateCustomer(CustomerService customer) {
        return customerService.save(customer);
    }

    @Override
    public CustomerService deleteCustomer(int id) {
        return customerService.deleteCustomer(id);
    }


}
