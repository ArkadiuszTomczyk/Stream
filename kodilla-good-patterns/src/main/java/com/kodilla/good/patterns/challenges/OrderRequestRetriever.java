package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {
    public StoreRequest retrive() {
        String user = "John";

        LocalDate buyWhen = LocalDate.of(2017,05, 15);

        return new StoreRequest(user, buyWhen);
    }
}
