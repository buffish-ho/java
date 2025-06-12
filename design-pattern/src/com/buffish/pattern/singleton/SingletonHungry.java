package com.buffish.pattern.singleton;

/**
 * 单例设计模式 - 饿汉实现方式
 * */
public class SingletonHungry {
    private static final SingletonHungry instance = new SingletonHungry();
    // 构造函数私有
    private SingletonHungry() {}
    // 实例方法
    public void process() {
        System.out.println("饿汉实例调用成功");
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
