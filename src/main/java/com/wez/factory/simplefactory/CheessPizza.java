package com.wez.factory.simplefactory;

public class CheessPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备Cheess披萨原材料");
    }

}
