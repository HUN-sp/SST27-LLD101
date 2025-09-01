package com.example.orders;

public final class OrderLine {
    private final String productId;
    private final int quantity;
    private final int unitPriceCents;

    public OrderLine(String productId, int quantity, int unitPriceCents) {
        if (quantity <= 0 || unitPriceCents < 0) {
            throw new IllegalArgumentException("Invalid order line values");
        }
        this.productId = productId;
        this.quantity = quantity;
        this.unitPriceCents = unitPriceCents;
    }

    public String getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public int getUnitPriceCents() { return unitPriceCents; }

    public int totalPrice() {
        return quantity * unitPriceCents;
    }
}
