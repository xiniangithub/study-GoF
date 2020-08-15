package com.wez.factory.abstractfactory;

public class LDGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("伦敦Greek");
    }

}
