package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class RentRequestRetriever {
    public StoreRequest retrive() {
        String user = new String("John", "D");

        LocalDate buyWhen = LocalDate.of(2017,05, 15);

        return new StoreRequest(user, buyWhen);
    }
}
