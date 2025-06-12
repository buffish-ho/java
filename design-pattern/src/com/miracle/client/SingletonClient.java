package com.miracle.client;

import com.miracle.pattern.singleton.*;

public class SingletonClient {
    public static void run() {
        // 懒汉实现
        SingletonLazy.getInstance().process();
        // 饿汉实现
        SingletonHungry.getInstance().process();
    }
}
