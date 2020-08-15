package com.wez.prototype;

public class Client {

    public static void main(String[] args) {
        Person person = new Person("张三", 21, new Address("上海"));
        // 深拷贝方式一
//        Person person1 = (Person) person.clone();
        // 深拷贝方式二
        Person person1 = (Person) person.serializableClone();

        System.out.println(person + ", " + person.hashCode() + ", " + person.getAddress() + ", " + person.getAddress().hashCode());
        System.out.println(person1 + ", " + person1.hashCode() + ", " + person1.getAddress() + ", " + person1.getAddress().hashCode());
    }

}
