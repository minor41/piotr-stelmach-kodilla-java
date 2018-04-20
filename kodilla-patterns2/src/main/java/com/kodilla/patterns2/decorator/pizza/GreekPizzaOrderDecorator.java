package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class GreekPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public GreekPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 15
        return super.getCost().add(new BigDecimal(15));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", black olives, feta, tomatoes, onions";
    }
}
