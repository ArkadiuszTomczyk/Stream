package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final String burger;
    private final String sauce;
    private final List<String> ingredients;

    public static class BurgerBuilder {
        private String roll;
        private String burger;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BurgerBuilder burger(String burger) {
            this.burger = burger;
            return this;
        }

        public BurgerBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BurgerBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BurgerBuilder ingredient (String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burger, sauce,ingredients);
        }
    }

    public Bigmac(final String roll, final String burger,final String sauce, final List<String> ingredients) {
        this.roll = roll;
        this.burger = burger;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public String getSauce() {
        return sauce;
    }

    public String getBurger() {
        return burger;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burger='" + burger + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
