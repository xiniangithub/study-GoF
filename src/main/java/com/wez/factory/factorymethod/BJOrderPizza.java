package com.wez.factory.factorymethod;

public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheess".equals(orderType)) {
            pizza = new BJCheessPizza();
            pizza.setName("北京Cheess");
        } else if ("greek".equals(orderType)) {
            pizza = new BJCheessPizza();
            pizza.setName("北京Greek");
        }
        return pizza;
    }

}
