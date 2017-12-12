package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class StoreRequest {
    public User user;
    public LocalDate buyWhen;

    public StoreRequest(final User user, final LocalDate buyWhen) {
        this.user = user;
        this.buyWhen = buyWhen;

    }

    public User getUser() {
        return user;
    }

    public LocalDate getBuyWhen() {
        return buyWhen;
    }
    //    User user = new User("John" "S");
//
//    LocalDate buyWhen = LocalDate.of(2017, 05, 15 );
//    return new StoreRequest(user, buyWhen);

}
