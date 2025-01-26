package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation @SpringBootApplication đánh dấu lớp này là lớp chính của Spring Boot ứng dụng
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // Khởi chạy ứng dụng Spring Boot
        SpringApplication.run(DemoApplication.class, args);
    }
}
