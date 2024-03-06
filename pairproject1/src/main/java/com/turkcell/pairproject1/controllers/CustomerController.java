package com.turkcell.pairproject1.controllers;
import org.springframework.web.bind.annotation.*;
import com.turkcell.pairproject1.entities.Customer;
import com.turkcell.pairproject1.services.abstracts.CustomerService;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService CustomerService;

    CustomerController(CustomerService CustomerService) {
        this.CustomerService = CustomerService;
    }


    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return (Customer) CustomerService.createCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return (Customer) CustomerService.getCustomerById(id);
    }

    @GetMapping("/all")
    public List<com.turkcell.pairproject1.services.abstracts.CustomerService> getAllCustomers() {
        return CustomerService.getAllCustomers();
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return (Customer) CustomerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable int id) {
        CustomerService.deleteCustomer(id);
    }



}