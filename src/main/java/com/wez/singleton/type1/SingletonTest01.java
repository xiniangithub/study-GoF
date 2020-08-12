package com.wez.singleton.type1;

/**
 * 测试
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

/**
 * 饿汉式（静态常量）
 */
class Singleton {
    // 构造方法私有化
    private Singleton() {}

    // 定义静态常量
    private static final Singleton instance = new Singleton();

    // 提供静态公共的获取对象实例的方法
    public static Singleton getInstance() {
        return instance;
    }

}
