package com.wez.singleton.type2;

/**
 * 测试
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

/**
 * 饿汉式（静态代码块）
 */
class Singleton {
    // 构造方法私有化
    private Singleton() {}

    // 声明静态常量
    private static Singleton instance;

    static { // 在静态代码块中创建对象实例
        instance = new Singleton();
    }

    // 暴露静态的公共获取对象实例的方法
    public static Singleton getInstance() {
        return instance;
    }

}
