package com.wez.factory.abstractfactory;

public class LDPizzaFactory implements PizzaAbstractFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheess".equals(orderType)) {
            pizza = new LDCheessPizza();
            pizza.setName("伦敦Cheess");
        } else if ("greek".equals(orderType)) {
            pizza = new LDGreekPizza();
            pizza.setName("伦敦Greek");
        }
        return pizza;
    }

}
