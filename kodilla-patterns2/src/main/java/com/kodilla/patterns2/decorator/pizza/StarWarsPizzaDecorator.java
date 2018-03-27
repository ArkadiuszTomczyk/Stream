package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class StarWarsPizzaDecorator extends AbstractPizzaOrderDecorator {
    public StarWarsPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(35));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + chubbaca meat" +
                " + star dust";

    }
}
