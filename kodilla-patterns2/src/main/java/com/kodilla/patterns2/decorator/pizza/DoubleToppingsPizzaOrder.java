package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleToppingsPizzaOrder extends AbstractPizzaOrderDecorator {
    public DoubleToppingsPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 12
        return super.getCost().add(new BigDecimal(12));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", double every topping";
    }
}
