package com.wez.factory.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    // 工厂方法
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        do {
            String orderType = getOrderType();
            Pizza pizza = createPizza(orderType);

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
