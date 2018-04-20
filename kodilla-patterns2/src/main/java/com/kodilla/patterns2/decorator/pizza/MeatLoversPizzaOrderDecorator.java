package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MeatLoversPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public MeatLoversPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 20
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", ham, bacon, beef, pepperoni, sausage";
    }
}
