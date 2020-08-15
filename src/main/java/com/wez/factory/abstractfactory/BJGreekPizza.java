package com.wez.factory.abstractfactory;

public class BJGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备北京Greek披萨原材料");
    }

}
