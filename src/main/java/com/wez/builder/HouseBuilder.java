package com.wez.builder;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class HouseBuilder {

    protected House house;

    // 打地基
    public abstract void build1();

    // 砌墙
    public abstract void build2();

    // 装修
    public abstract void build3();

    // 获取House实例
    public abstract House build();
}
