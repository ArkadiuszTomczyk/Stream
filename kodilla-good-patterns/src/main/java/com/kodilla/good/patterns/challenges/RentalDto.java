package com.kodilla.good.patterns.challenges;

public class RentalDto {
    public String user;
    public boolean isAvaliable;

    public RentalDto(final String user, final boolean isAvaliable) {
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
