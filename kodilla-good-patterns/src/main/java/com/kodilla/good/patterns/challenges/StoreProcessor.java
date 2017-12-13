package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class StoreProcessor implements StoreService{

    @Override
    public boolean buy() {
        Random generator = new Random();
        System.out.println("Buying goods");
        return generator.nextBoolean();

    }
}
