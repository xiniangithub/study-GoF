package com.wez.prototype;

import java.io.Serializable;

public class Address implements Cloneable, Serializable {

    private String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
