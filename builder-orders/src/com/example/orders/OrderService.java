package com.example.orders;

import java.util.List;

public class OrderService {
    public Order createOrder(String id, String email, List<OrderLine> lines,
                             DiscountPolicy discountPolicy, boolean expedited, String notes) {
        return new Order(id, email, lines, discountPolicy, expedited, notes);
    }
}
