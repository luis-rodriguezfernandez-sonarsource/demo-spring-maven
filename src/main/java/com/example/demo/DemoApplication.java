package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public double getTotal() {
        double subtotal = calculateSubtotal();
        double tax = getTax(); // Unique to Order
        double discount = getDiscount(); // Identical in both classes
        return subtotal + tax - discount;
    }
    private double calculateSubtotal() {
        // Logic to calculate subtotal
        return 100.0; // Example value
    }
    private double getTax() {
        // Logic to calculate tax
        return 15.0; // Example value
    }
    private double getDiscount() {
        // Logic to calculate discount
        return 5.0; // Example value
    }
}
