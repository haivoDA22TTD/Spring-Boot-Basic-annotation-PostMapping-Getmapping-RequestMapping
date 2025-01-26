package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Phương thức tạo khách hàng mới
    @PostMapping
    public String createCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerService.createCustomer(customer);
        return "Khách hàng đã được tạo: " + createdCustomer.getName();
    }

    // Phương thức lấy thông tin khách hàng theo id
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") long id) {
        return customerService.getCustomerById(id);
    }

    // Phương thức lấy tất cả khách hàng
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
