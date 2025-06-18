package com.example.demo;

public class InternationalNewOrder {
    private final int quantity;
    // ... other fields

    public InternationalNewOrder(final int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }


    public void processInternationalNewOrder(InternationalNewOrder order) {
        // Identical common processing logic
        // ...
        calculateNewTotal();
        // ...
        applyNewDiscount();
        // ...
        handleInternationalNewTax();
    }

    private void handleInternationalNewTax() {
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
        InternationalNewOrder otherInternationalOrder = (InternationalNewOrder) other;
        return quantity == otherInternationalOrder.quantity;
    }
}

