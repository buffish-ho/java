package com.buffish.pattern.singleton;

/**
 * 单例设计模式 - 懒汉实现方式（使用枚举方式）
 * */
public enum SingletonLazyEnum {
    // 保证线程安全，避免反序列化重新创建对象
    INSTANCE;
    // 实例方法
    public void process() {
        System.out.println("懒汉实例调用成功");
    }
}
