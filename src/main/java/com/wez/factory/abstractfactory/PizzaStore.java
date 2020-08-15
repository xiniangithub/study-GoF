package com.wez.factory.abstractfactory;

public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza(new BJPizzaFactory());

        new OrderPizza(new LDPizzaFactory());
    }

}
