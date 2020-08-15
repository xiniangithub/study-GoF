package com.wez.factory.simplefactory;

public class SimpleFactory {

    public static Pizza create(String orderType) {
        Pizza pizza = null;
        if ("cheess".equals(orderType)) {
            pizza = new CheessPizza();
            pizza.setName("Cheess");
        } else if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("Greek");
        }
        return pizza;
    }



}
