package com.example.orders;

public class PercentageDiscount implements DiscountPolicy {
    private final int discountPercent;

    public PercentageDiscount(int discountPercent) {
        if (!PricingRules.isValidDiscount(discountPercent)) {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        }
        this.discountPercent = discountPercent;
    }

    @Override
    public int applyDiscount(int total) {
        return total - (total * discountPercent / 100);
    }
}
