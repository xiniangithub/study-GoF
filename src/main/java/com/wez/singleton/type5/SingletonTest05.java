package com.wez.singleton.type5;

public class SingletonTest05 {
}

/**
 * 懒汉式（线程安全，同步代码块）
 */
class Singleton {
    // 构造方法私有化
    private Singleton() {}

    // 声明静态常量
    private static Singleton instance;

    // 暴露静态的公共获取对象实例的方法，通过同步代码块解决线程不安全问题，但这种方式并不能解决线程不安全问题，是一种错误的写法
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

}
