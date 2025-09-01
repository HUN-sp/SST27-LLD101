package com.example.orders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines;
    private final DiscountPolicy discountPolicy;
    private final boolean expedited;
    private final String notes;

    public Order(String id, String customerEmail, List<OrderLine> lines,
                 DiscountPolicy discountPolicy, boolean expedited, String notes) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("Order ID required");
        if (!PricingRules.isValidEmail(customerEmail)) throw new IllegalArgumentException("Invalid email");

        this.id = id;
        this.customerEmail = customerEmail;
        this.discountPolicy = discountPolicy != null ? discountPolicy : total -> total;

        // Defensive copy to avoid mutability leaks
        this.lines = Collections.unmodifiableList(new ArrayList<>(lines));
        this.expedited = expedited;
        this.notes = notes;
    }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderLine> getLines() { return lines; }
    public boolean isExpedited() { return expedited; }
    public String getNotes() { return notes; }

    public int totalBeforeDiscount() {
        return lines.stream().mapToInt(OrderLine::totalPrice).sum();
    }

    public int totalAfterDiscount() {
        return discountPolicy.applyDiscount(totalBeforeDiscount());
    }
}
