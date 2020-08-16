package com.wez.builder;

public class House {

    private String name;
    private String hight;

    public House(String name, String hight) {
        this.name = name;
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", hight='" + hight + '\'' +
                '}';
    }
}
