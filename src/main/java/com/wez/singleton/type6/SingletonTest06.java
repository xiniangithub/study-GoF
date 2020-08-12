package com.wez.singleton.type6;

/**
 * 测试
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

/**
 * 双重检查
 */
class Singleton {
    // 构造方法私有化
    private Singleton() {}

    // 声明对象实例
    private static volatile Singleton instance;

    // 暴露静态的公共获取对象实例的方法，通过双重检查解决线程不安全问题，同时达到了懒加载的效果
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
