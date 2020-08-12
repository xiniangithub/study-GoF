package com.wez.singleton.type4;

/**
 * 测试
 */
public class SingletonTest04 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

/**
 * 懒汉式（线程安全，同步方法）
 */
class Singleton {
    // 构造方法私有化
    private Singleton() {}

    // 声明静态常量
    private static Singleton instance;

    // 暴露静态的公共获取对象实例的方法，使用同步方法解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
