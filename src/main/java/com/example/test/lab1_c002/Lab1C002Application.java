package com.example.test.lab1_c002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1C002Application implements CommandLineRunner {

    @Autowired
    private Employee employee;

    public static void main(String[] args) {
        SpringApplication.run(Lab1C002Application.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Employee details from CommandLineRunner:");
        System.out.println(employee);
    }
}
