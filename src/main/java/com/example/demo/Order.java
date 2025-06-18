package com.example.demo;

public class Order {
    private final int quantity;
    // ... other fields

    public Order(final int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void processOrder(Order order) {
        // Common processing logic
        // ...
        calculateTotal();
        // ...
        applyDiscount();
        // ...
    }

    private void applyDiscount() {
    }

    private void calculateTotal() {
        
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Order otherOrder = (Order) other;
        return quantity == otherOrder.quantity;
    }
}

