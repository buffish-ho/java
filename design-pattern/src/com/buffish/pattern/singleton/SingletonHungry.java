package com.buffish.pattern.singleton;

/**
 * 单例设计模式 - 饿汉实现方式
 * */
public class SingletonHungry {
    // 第一种方式：使用静态常量创建实例
//    private static final SingletonHungry instance = new SingletonHungry();
    // 构造函数私有
    private SingletonHungry() {}
    // 第二种方式：使用静态代码块创建实例
    private static SingletonHungry instance;
    static {
        instance = new SingletonHungry();
    }
    // 实例方法
    public void process() {
        System.out.println("饿汉实例调用成功");
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
