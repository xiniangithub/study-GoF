# 设计模式的目的

设计模式可以使程序具有更好的：
1. 代码重用性（即：相同功能的代码，不用编写多次）
2. 可读性（即：编程规范性，便于其他程序员的阅读和理解）
3. 可扩展性（即：当需要增加新功能时，非常方便）
4. 可靠性（即：当增加新的功能时，对原来的功能没有影响）
5. 是程序呈现**高内聚，低耦合**的特性


# 设计模式七大原则

- 单一职责原则
- 接口隔离原则
- 依赖倒转（倒置）原则
- 里氏替换原则
- 开闭原则
- 迪米特法则
- 合成复用原则

## 单一职责原则(Single Responsibility Principle)

对类来说，即**一个类应该只负责一项职责**。

单一职责原则注意事项和细节
- 降低类的复杂度，一个类只负责一项职责。
- 提高类的可读性，可维护性。
- 降低变更引起的风险。
- 通常情况下，应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则，只有类中方法数量足够少，可以在方法级别保持单一职责原则。


## 接口隔离原则(Interface Segregation Principle)

客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上。

## 依赖倒转原则(Dependence Inversion Principle)

依赖倒转原则是指：
- 高层模块不应该依赖底层模块，二者都应该依赖其抽象。
- 抽象不应该依赖细节，细节应该依赖抽象。
- 依赖倒转的中心思想是面向接口编程。
- 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在Java中，抽象指的是接口或抽象类，细节就是具体的实现类。
- 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。

依赖关系传递的三种方式
- 接口传递
- 构造方法传递
- setter方法传递

依赖倒转原则的注意事项和细节
- 底层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好。
- 变量的声明类型尽量是抽象类或接口，这样我们的变量引用和实际对象间，就存在一个缓冲层，利于程序扩展和优化。
- 继承时遵循里氏替换原则。

## 里氏替换原则(Liskov Substitution Principle)

里氏替换原则介绍
- 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型。换句话说，所有引用基类的地方必须能透明地使用其子类的对象。
- 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法。
- 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可以通过**聚合、组合、依赖类解决问题**。

面向对象的继承性的思考和说明
- 继承包含这样一层含义：父类中凡是已经实现好的方法，实际上是在设定规范和契约，虽然它不强制要求所有的子类必须遵循这些契约，但是如果子类对这些已经实现的方法任意修改，就会对整个继承体系造成破坏。
- 继承在给程序设计带来便利的同时，也带来了弊端。比如使用继承会给程序带来侵入性，程序的可移植性降低，增加对象间的偶核性，如果一个类被其他的类所继承，则当这个类需要修改时，必须考虑到所有的子类，并且父类修改后，所有涉及子类的功能都有可能产生故障。
- 在编程中，如何正确的使用继承？遵循**里氏替换原则**

解决方法

- 我们发现原来运行正常的相减功能发生了错误。原因就是类B无意中重写了父类的方法，造成原有功能出现错误。在实际编程中，我们常常会通过重写父类的方法完成新的功能，这样写起来虽然简单，但整个继承体系的复用性会比较差。特别是运行多态比较频繁的时候。
- 通用的做法是：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉采用依赖、聚合、组合等关系代理。

## 开闭原则(Open Closed Priciple)

一个软件实体，如类、模块和函数应该对扩展开放(对提供方)，对修改关闭（对使用方）。用抽象构建框架，用实现扩展细节。
- 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
- 编程中遵循其他原则，以及使用设计模式的目的就是遵循开闭原则。

## 迪米特法则(Demeter Principle)

- 一个对象应该对其他对象保持最少的了解。
- 类与类关系越密切，耦合度越大。
- 迪米特法则又叫最少知道原则，即一个类对自己依赖的类知道的越少越好，也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public方法，不对外泄露任何信息。
- 迪米特法则还有个更简单的定义：只与直接的朋友通信。
- **直接的朋友：**每个对象都会与其他有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系。耦合的方式很多，依赖，关联，组合，聚合等，器中，我们称出现成员变量，方法参数，方法返回值中的类为直接朋友，而出现在局部变量中的类不是直接的朋友。也就是说，陌生的类最好不要以局部变量的形式出现在类的内部。

迪米特法则注意事项和细节
- 迪米特法则的核心是降低类之间的偶核。
- 但是注意：由于每个类都减少了不必要的依赖，因此迪米特法则只是要求降低类间（对象间）耦合关系，并不是要求完全没有依赖关系。

## 合成复用原则(Composite Reuse Principle)

尽量使用合成/聚合的方式，而不是使用继承。

## 设计原则的核心思想

- 找出应用中可能需要变化的地方，把他们独立出来，不要和那些不需要变化的代码混合在一起。
- 针对接口编程，而不是针对实现编程。
- 为了交互对象之间的松耦合设计而努力。



# UML(Unified modeling language)

UML，统一建模语言。

## UML工具

- Rational Rose
- Enterprise Architect
- visio

## UML类图

UMl类图用于描述系统中的类（对象）本身的组成和类（对象）之间的各种静态关系。

类之间的关系
- Dependency：表示依赖（使用）
- Generalization：表示泛化（继承）
- Realization：表示实现
- Association：表示关联
- Aggregation：表示聚合
- Composite：表示组合

### 依赖关系(dependence)

只要是在**类中用到了对方**，那么它们之间就存在依赖关系。如果没有对方，连编译都通过不了。

“类中用到了对方”场景：
- 类的成员属性
- 方法的参数类型
- 方法的返回类型
- 方法中的局部变量

### 泛化关系(generalization)

泛化关系实际上就是继承关系，它是依赖关系的特例。

### 实现关系(Implementation)

实现关系实际上就是A类实现B类，它是依赖关系的特例。

### 关联关系(Association)

关联关系实际上就是类与类之间的联系，它是依赖关系的特例。

- 关联具有导航性，即双向关系或单向关系。
- 关联具有多重性，如“1”（表示有且仅有一个），“0...”（表示0个或多个），“0,1”（表示0个或者多个），“n...m”（表示n到m个都可以），“m...*”（表示至少m个）。

### 聚合关系(Aggregation)

聚合关系表示的是整理和部分的关系，整体与部分可以分开。聚合关系是关联关系的特例，所以它具有关联的导航性与多重性。

### 组合关系(Composition)

组合关系也是整体与部分的关系，但是**整体与部分不能分开**。



# 设计模式(Design Parttern)

## 设计模式介绍

- 设计模式是程序员在面对同类软件工程设计问题所总结出来的有用的经验，**模式不是代码，而是某类问题的解决方案**，设计模式代表了最佳实践。这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。
- 设计模式的本质是**提高软件的维护性、通用性和扩展性，并降低软件的复杂度**。

## 设计模式类型

设计模式分为三中类型，总共23种。
- 创建型模式：单例模式、抽象工厂模式、原型模式、建造者模式、工厂模式。
- 结构型模式：适配器模式、桥接模式、装饰者模式、组合模式、外观模式、享元模式、代理模式。
- 行为型模式：模板方法模式、命令模式、访问者模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式(Interpreter模式)、状态模式、策略模式、职责链模式(责任链模式)。

## 单例模式

单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类**只能存在一个对象实例**，并且该类只提供一个获取其对象实例的方法。

单例模式有八种方式：
- **饿汉式（静态常量）**
- **饿汉式（静态代码块）**
- 懒汉式（线程不安全）
- 懒汉式（线程安全，同步方法）
- 懒汉式（线程安全，同步代码块）
- **双重检查**
- **静态内部类**
- **枚举**

### 饿汉式（静态常量）

步骤：
1) 构造器私有化
2) 类的内部创建对象
3) 向外暴露一个静态的公共方法getInstance

代码实现
```java
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
```

优缺点
- 优点：写法比较简单，在类加载的时候就完成实例化，避免了线程同步问题。
- 缺点：在类装载的时候就完成实例化，没有达到懒加载(Lazy Loading)的效果。如果从始至终没有使用这个实例，则会造成内存浪费。
- 这种方式基于classloader机制避免了多线程的同步问题，不过，instance在类装在时就实例化，在单例模式中大多数都是调用getInstance方法，但是导致类装载的原因有很多种，因此不能确定有其它的方式（或者其它的静态方法）导致类装载，这时候初始化instance就没有达到lazy loading的效果。
- 结论：这种单例模式**可用**，但**可能**造成内存浪费。

### 饿汉式（静态代码块）

```java
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
```

优缺点
- 这种方式和 **饿汉式（静态常量）** 的方式类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化的实例。优缺点和 **饿汉式（静态常量）** 一样。
- 结论：这种单例模式**可用**，但是**可能**造成内存浪费

### 懒汉式（线程不安全）

```java
/**
 * 懒汉式（线程不安全）
 */
class Singleton {
    // 构造方法私有化
    private Singleton() {}

    // 声明静态常量
    private static Singleton instance;

    // 暴露静态的公共获取对象实例的方法，但是在调用时才创建 instance 对象实例
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

/**
 * 测试
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);

        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}
```

优缺点
- 起到了Lazy Loading的效果，但是只能在单线程下使用。
- 如果在多线程下 ，一个线程进入了 if (instance == null) 判断语句块，还未来得及往下执行，另一个线程也通过这个判断语句，这是便会产生多个实例。所以在多线程环境下不可以使用这种方式。
- 结论：在实际开发中，不要使用这种方式。

### 懒汉式（线程安全，同步方法）

```java
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
```

优缺点
- 优点：解决了线程不安全问题。
- 缺点：效率太低，每个线程在想获得类的实例时候，执行getInstance()都需要进行同步。而其实这个方法只执行一次实例话代码就够了，后面的想获得类实例，直接return就行了。方法进行同步效率太低。
- 结论：在实际开发中，不推荐使用这种方式。

### 懒汉式（线程安全，同步代码块）

```java
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
```

优缺点
- 这种方式，本意是想对 **懒汉式（线程安全，同步方法）** 实现方式的改进，因为前面同步方法效率太低，改为同步产生实例化的代码块。
- 但是这种同步并不能启动线程同步的作用，跟 **懒汉式（线程不安全）** 实现方式一样，假如一个线程进入了 if (instance == null) 判断语句，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个对象实例。
- 结论：在实际开发中，不能使用这种方式。

### 双重检查

```java
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
```

- 双重检查，Double-Check，是多线程开发中经常使用的。如代码示例中，对instence进行了两次检查，这样就可以保证线程安全了。
- 这样，实例话代码只用执行一次，后面再次访问时，判断if(instance == null)，直接return实例话对象，也避免了反复进行方法同步。
- 线程安全，延迟加载，效率较高。
- 结论：在实际开发中，推荐使用这种单例设计模式。

### 静态内部类

```java
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
```

优缺点
- 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
- 静态内部类的实现方式再Singleton类被装在时不会被立即实例话，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton实例化。
- 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
- 优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高。
- 结论：这种实现方式，推荐使用。

### 枚举

```java
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
```

优缺点
- 借助JDK1.5中添加的枚举类实现单例模式，不仅能避免多线程同步问题，而且还能防止反序列化重新创建对象。
- 这种方式是Effective Java作者Josh Bloch提倡的方式。
- 结论：这种实现方式，推荐使用。

### 源码分析

在JDK源码中，java.lang.Runtime类就是单例模式的饿汉式实现。

### 单例模式注意事项和细节说明

- 单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，对于一些许哟啊频繁创建销毁的对象，使用单例模式可以提供系统性能。
- 当想实例化一个单例类的时候，必须要使用相应的获取对象的方法，而不是使用new。
- 单例模式使用的场景，需要频繁的进行创建和销毁的对象、创建对象时耗时过多或耗费资源过多（即：重量级对象），但又经常用到的对象、工具类对象、频繁访问数据库或文件的对象（比如数据源、Session工厂等）。



## 工厂模式

### 简单工厂模式

基本介绍
- 简单工厂模式属于创建型模式，是工厂模式的一种。简单工厂模式是由一个工厂对象决定创建出哪一种产品的实例。简单工厂模式是工厂模式家族中最简单使用的模式。
- 简单工厂模式：定义一个创建对象的类，由这个类来封装实例化对象的行为。
- 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂模式。
- 简单工厂模式又叫静态工厂模式。

### 工厂方法模式

### 抽象工厂模式

- 抽象工厂模式：定义了一个接口用于创建相关或有依赖的的对象簇，而无需指明具体的类。
- 抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合。
- 从设计层面上看，抽象工厂模式就是对简单工厂模式的改进（或者称为进一步抽象）。
- 将工厂抽象成两层，AbsFactory(抽象工厂)和具体实现的工厂子类。程序员可以根据创建对象类型使用对于的工厂子类。这样将单个的简单工厂类变成工厂簇，更利于代码的维护和扩展。

### 源码分析

在JDK中的Calendar中使用了简单工厂模式。

### 工厂模式总结

- 工厂模式的意义
  - 将实例化对象的代码提取出来，放到一个类中统一管理和维护，达到和主项目的依赖关系的解耦。从而提高项目的扩展性和维护性。
- 三种工厂模式：简单工厂模式、工厂方法模式、抽象工厂模式
- 设计模式的依赖抽象原则
  - 创建对象实例时，不要直接new，而是把这个new的动作放在一个工厂的方法中，并返回。有的说是，变量不要直接持有具体类的引用。
  - 不要让类继承具体的类，而是继承抽象类或者实现接口。
  - 不要覆盖基类中已经实现的方法。



## 原型模式

- 原型模式（Prototype）是指：用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象。
- 原型模式是一种创建型设计模式，允许一个对象再创建另外一个可定制的对象，无需知道如何创建的细节。
- 工作原理：通过将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建，即对象.clone()。

### 浅拷贝

- 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。
- 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值（内存地址）复制一份 给新的对象。因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值。
- 浅拷贝是使用默认的clone()方法来实现的。

### 深拷贝

- 复制对象的所有基本数据类型的成员变量值。
- 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对整个对象进行拷贝。
- 深拷贝的实现方式：
  - 重写clone方法。
  - 对象序列化。

### 原型模式总结

- 创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率。
- 不用重新初始化对象，而是动态地获得对象运行时的状态；
- 如果原始对象发生变化（增加或者减少属性），其它克隆对象的也会发生相应的变化，无需修改代码。
- 在实现深克隆的时候可能需要比较复杂的代码。
- 缺点：需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有的类进行改造时，需要修改其源代码，违背了ocp原则。



## 建造者模式

- 建造者模式（Builder Pattern），是一种对象构建模式。它可以将复杂对象的建造过程抽象出来（抽象类别），使这个抽象过程的不同实现方式可以构造出不同的表现（属性）的对象。
- 建造者模式是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建他们，用户不需要知道内部的具体构建细节。
- 建造者模式四个角色：
  - Product（产品角色）：一个具体的产品对象。
  - Builder（抽象建造者）：创建一个Product对象的各个部件的指定的接口或抽象类。
  - ConcreteBuilder（具体建造者）：实现接口，构建和装配各个部件。
  - Director（指挥者）：构建一个使用Builder接口的对象，它主要是用于创建一个复杂的对象。它主要有两个作用，一是，隔离了客户与对象的生产过程，二是，负责控制产品对象的生产过程。

### 源码分析

在JDK源码中，StringBuilder使用了建造者模式。

### 建造模式总结

- 客户端（使用程序）不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不通的产品对象。
- 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换建造者或增加新的具体建造者，用户使用不同的具体建造者即可得到不同的产品对象。
- 可以更加精细地控制产品的创建过程。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程。
- 增加新的具体建造者无需修改原有类库的代码，指挥者针对抽象建造者编程，系统扩展方便，符合“开闭原则”。
