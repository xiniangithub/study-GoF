package com.wez.builder;

public class CommonHouse extends HouseBuilder {


    @Override
    public void build1() {
        System.out.println("建造普通房子地基");
    }

    @Override
    public void build2() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void build3() {
        System.out.println("普通房子装修");
    }

    @Override
    public House build() {
        house = new House("普通房子", "两层高");
        return house;
    }
}
