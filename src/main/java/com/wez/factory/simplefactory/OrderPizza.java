package com.wez.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType = "";

        do {
            orderType = getOrderType();

            pizza = SimpleFactory.create(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("结束");
                break;
            }
        } while(true);
    }

    private String getOrderType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String orderType = null;
        try {
            orderType = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orderType;
    }

}
