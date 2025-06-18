package com.example.demo;

public class InternationalOrder {
    private final int quantity;
    // ... other fields

    public InternationalOrder(final int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        InternationalOrder otherInternationalOrder = (InternationalOrder) other;
        return quantity == otherInternationalOrder.quantity;
    }
}

