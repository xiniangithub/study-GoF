package com.wez.builder;

public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector director = new HouseDirector(commonHouse);
        House common = director.build();
        System.out.println(common);

        HightHouse hightHouse = new HightHouse();
        director.setBuilder(hightHouse);
        House hight = director.build();
        System.out.println(hight);
    }

}
