package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class StoreRequest {
    public String user;
    public LocalDate buyWhen;

    public StoreRequest(final String user, final LocalDate buyWhen) {
        this.user = user;
        this.buyWhen = buyWhen;

    }

    public String getUser() {
        return user;
    }

    public LocalDate getBuyWhen() {
        return buyWhen;
    }
}
