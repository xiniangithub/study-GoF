package com.wez.prototype;

import java.io.*;

public class Person implements Cloneable, Serializable {

    private String name;

    private Integer age;

    private Address address;

    public Person(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }

    // 深拷贝方式一：使用clone方法
    @Override
    protected Object clone() {
        Object obj = null;
        try {
            obj = super.clone();

            Person person = (Person) obj;
            person.address = (Address) address.clone();
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    // 深拷贝方式二：使用序列化方式
    public Object serializableClone() {
        Object obj = null;
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;

        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);

            obj = ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
