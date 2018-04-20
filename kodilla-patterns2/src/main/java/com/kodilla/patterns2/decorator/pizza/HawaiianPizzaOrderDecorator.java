package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiianPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public HawaiianPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 10
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", ham, pineapple";
    }
}
