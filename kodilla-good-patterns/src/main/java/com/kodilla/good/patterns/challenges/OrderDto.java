package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public String user;
    public boolean isAvaliable;

    public OrderDto(final String user, final boolean isAvaliable) {
        this.user = user;
        this.isAvaliable = isAvaliable;
    }

    public String getUser() {
        return user;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }
}
