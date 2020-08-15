package com.wez.factory.abstractfactory;

public class BJPizzaFactory implements PizzaAbstractFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheess".equals(orderType)) {
            pizza = new BJCheessPizza();
            pizza.setName("北京Cheess");
        } else if ("greek".equals(orderType)) {
            pizza = new BJGreekPizza();
            pizza.setName("北京Greek");
        }
        return pizza;
    }

}
