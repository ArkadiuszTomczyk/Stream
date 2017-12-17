package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private final String forumUser;

    public ForumUser() {
        this.forumUser = "John Smith";
    }

    public static String getName() {

        return "John Smith";
    }
}
