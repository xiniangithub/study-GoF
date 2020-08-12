package com.wez.singleton.type8;

/**
 * 测试
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }

}

/**
 * 枚举
 */
enum Singleton {
    INSTANCE;
    private Singleton() {}

    public void print() {
        System.out.println("Hello world");
    }
}
