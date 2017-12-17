package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    public ForumUser() {
    }

    public static String getName() {
        return "John Smith";
    }
}
