package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String userName;

    String userName() {
        this.userName = "John Smith";
        return "John Smith";
    }
}
