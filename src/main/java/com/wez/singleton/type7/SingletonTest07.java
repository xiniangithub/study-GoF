package com.wez.singleton.type7;

/**
 * 测试
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

/**
 * 静态内部类
 */
class Singleton {
    // 构造方法私有化
    private Singleton() {}

    // 定义静态内部类
    // 利用静态内部类的两个特性，解决线程不安全和懒加载问题：
    // 类加载的时候，静态内部类不会被立即装载，而是在第一次使用的时候装载，这个特性解决懒加载问题。
    // 静态内部类在装载的时候，是线程安全的，这是JVM提供的线程安全环境，这个特性解决了线程不安全问题。
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 暴露静态的公共获取对象实例的方法
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
