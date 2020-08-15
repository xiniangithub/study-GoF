package com.wez.factory.simplefactory;

public abstract class Pizza {

    private String name;

    // 准备材料
    public abstract void prepare();

    // 烘焙
    public void bake() {
        System.out.println("烘焙");
    }

    // 切割
    public void cut() {
        System.out.println("切割");
    }

    // 打包
    public void box() {
        System.out.println("打包");
    }

    public void setName(String name) {
        this.name = name;
    }

}
