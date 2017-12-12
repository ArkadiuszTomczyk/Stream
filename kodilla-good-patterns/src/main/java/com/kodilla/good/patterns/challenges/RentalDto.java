package com.kodilla.good.patterns.challenges;

public class RentalDto {
    public User user;
    public boolean isAvaliable;

    public RentalDto(final User user, final boolean isAvaliable) {
        this.user = user;
        this.isAvaliable = isAvaliable;
    }

    public User getUser() {
        return user;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }
}
