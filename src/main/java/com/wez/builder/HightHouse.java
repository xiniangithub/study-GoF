package com.wez.builder;

public class HightHouse extends HouseBuilder {

    @Override
    public void build1() {
        System.out.println("建造高楼房子地基");
    }

    @Override
    public void build2() {
        System.out.println("高楼房子砌墙");
    }

    @Override
    public void build3() {
        System.out.println("高楼房子装修");
    }

    @Override
    public House build() {
        house = new House("高楼房子", "十层高");
        return house;
    }
}
