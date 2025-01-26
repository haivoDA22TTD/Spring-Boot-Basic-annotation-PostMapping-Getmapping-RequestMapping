package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;

@Service
public class CustomerService {

    // Khai báo danh sách khách hàng
    private List<Customer> customers = new ArrayList<>();

    // Constructor giả lập danh sách khách hàng
    public CustomerService() {
        customers.add(new Customer(1L, "Lê Đặng Thúy Vy", "trumvyvy@gmail.com"));
        customers.add(new Customer(2L, "Phan Ngọc Anh Thư", "anhthu@gmail.com"));
        customers.add(new Customer(3L, "Trần Hà Linh", "Top1server@gmail.com"));
    }

    // Tạo phương thức thêm khách hàng
    public Customer createCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    // Tạo phương thức lấy thông tin khách hàng theo id
    public Customer getCustomerById(long id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Phương thức lấy tất cả khách hàng
    public List<Customer> getAllCustomers() {
        return customers;
    }
}
