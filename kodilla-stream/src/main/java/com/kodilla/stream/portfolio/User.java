package com.kodilla.stream.portfolio;

public class User {
    private final String userName;
    private final String realNAme;

    public User(String userName, String realNAme) {
        this.userName = userName;
        this.realNAme = realNAme;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealNAme() {
        return realNAme;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return userName.equals(user.userName);
    }

}
