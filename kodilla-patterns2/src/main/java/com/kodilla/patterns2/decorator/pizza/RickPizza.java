package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class RickPizza extends AbstractPizzaOrderDecorator {
    public RickPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(15));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + salt" +
                " + mysterious things";

    }
}
