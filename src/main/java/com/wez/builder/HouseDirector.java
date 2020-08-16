package com.wez.builder;

public class HouseDirector {

    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House build() {
        builder.build1();
        builder.build2();
        builder.build3();
        return builder.build();
    }

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }
}
