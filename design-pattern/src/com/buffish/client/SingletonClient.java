package com.buffish.client;

import com.buffish.pattern.singleton.*;

public class SingletonClient {
    static { PatternClient.ready("单例模式"); }
    public static void run() {
        // 懒汉实现
        SingletonLazy l1 = SingletonLazy.getInstance();
        SingletonLazy l2 = SingletonLazy.getInstance();
        System.out.print("使用懒汉方式创建单例: ");
        System.out.println("l1=l2: " + (l1 == l2) + ",l1.hashCode=l2.hashCode: " + (l1.hashCode() == l2.hashCode()));
        SingletonLazy.getInstance().process();

        // 懒汉实现（使用枚举）
        SingletonLazyEnum e1 = SingletonLazyEnum.INSTANCE;
        SingletonLazyEnum e2 = SingletonLazyEnum.INSTANCE;
        System.out.print("使用懒汉方式创建单例(枚举): ");
        System.out.println("e1=e2: " + (e1 == e2) + ",e1.hashCode=e2.hashCode: " + (e1.hashCode() == e2.hashCode()));
        SingletonLazyEnum.INSTANCE.process();

        // 饿汉实现
        SingletonHungry h1 = SingletonHungry.getInstance();
        SingletonHungry h2 = SingletonHungry.getInstance();
        System.out.print("使用饿汉方式创建单例: ");
        System.out.println("h1=h2: " + (h1 == h2) + ",h1.hashCode=h2.hashCode: " + (h1.hashCode() == h2.hashCode()));
        SingletonHungry.getInstance().process();
    }
}
