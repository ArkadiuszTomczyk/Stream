package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private  final LocalDate birthDate;
    private  final int postCount;

    public ForumUser(int userId, String userName, char userSex, LocalDate birthDate, int postCount) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = birthDate;
        this.postCount = postCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                " userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}
