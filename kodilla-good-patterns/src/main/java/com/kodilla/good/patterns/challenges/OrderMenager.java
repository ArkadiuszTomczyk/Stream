package com.kodilla.good.patterns.challenges;

public class OrderMenager implements OrderRepository {

    @Override
    public String createOrder() {
        return "New Order";
    }
}
