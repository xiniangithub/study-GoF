package com.wez.factory.factorymethod;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheess".equals(orderType)) {
            pizza = new LDCheessPizza();
            pizza.setName("伦敦Cheess");
        } else if ("greek".equals(orderType)) {
            pizza = new LDCheessPizza();
            pizza.setName("伦敦Greek");
        }
        return pizza;
    }

}
