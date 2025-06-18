package com.example.demo;

public class NewOrder {
    private final int quantity;
    // ... other fields

    public NewOrder(final int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void processOrder(NewOrder order) {
        // Common processing logic
        // ...
        calculateNewTotal();
        // ...
        applyNewDiscount();
        // ...
    }

    private void applyNewDiscount() {
    }

    private void calculateNewTotal() {
        
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        NewOrder otherOrder = (NewOrder) other;
        return quantity == otherOrder.quantity;
    }
}

