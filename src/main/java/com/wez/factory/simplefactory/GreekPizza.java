package com.wez.factory.simplefactory;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备Greek披萨原材料");
    }

}
