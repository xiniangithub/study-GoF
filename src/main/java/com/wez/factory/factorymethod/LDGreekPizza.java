package com.wez.factory.factorymethod;

public class LDGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("伦敦Greek");
    }

}
