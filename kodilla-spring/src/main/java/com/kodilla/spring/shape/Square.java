package com.kodilla.spring.shape;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Square implements Shape {
    @Override
    public String getShapeName() {
        return "This is a square.";
    }
}
