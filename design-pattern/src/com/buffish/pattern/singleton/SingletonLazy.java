package com.buffish.pattern.singleton;

/**
 * 单例设计模式 - 懒汉实现方式
 * */
public class SingletonLazy {
//    private static SingletonLazy instance;
    // 构造函数私有
    private SingletonLazy() {}

    // 实例方法
    public void process() {
        System.out.println("懒汉实例调用成功");
    }

    // 第一种方式：线程不安全，多线程下回存在安全问题
//    public static SingletonLazy getInstance() {
//        if (instance == null) {
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }

    // 第二种方式：通过加锁 synchronized 保证单例(但采用对方法加锁在高并发场景中存在很大的性能开销)
//    public static synchronized SingletonLazy getInstance() {
//        if (instance == null) {
//            instance = new SingletonLazy();
//        }
//        return instance;
//    }

    // 第三种方式：通过细粒度加锁 synchronized + dcl(Double-Checked-Locking) 可在多线程条件下保持高性能
    // 但是否安全？instance = new SingletonLazy()；此处并非原子性操作(存在指令重排风险)
    // 1. 分配空间给对象；2. 在空间内创建对象；3. 将对象赋值引用给instance
    // 假设由于指令重排按1->3->2顺序创建，会把值写到主内存，其他线程会读取到instance最新值，但此时并非完全的对象
//    public static SingletonLazy getInstance() {
//        if (instance == null) {
//            synchronized (SingletonLazy.class) {
//                if (instance == null) {
//                    instance = new SingletonLazy();
//                }
//            }
//        }
//        return instance;
//    }

    // 第四种方式：使用 volatile 避免指令重排，同时保证在多线程条件下保持高性能
//    private static volatile SingletonLazy instance;
//    public static SingletonLazy getInstance() {
//        // 第一重检查
//        if (instance == null) {
//            // 线程安全
//            synchronized (SingletonLazy.class) {
//                // 第二重检查
//                if (instance == null) {
//                    instance = new SingletonLazy();
//                }
//            }
//        }
//        return instance;
//    }

    // 第五种方式: 使用静态内部类实现，保证静态内部类加载时只有一个线程（线程安全）
    // 默认外部类(单例类)初次加载时，静态内部类还不会立即加载，只有当调用getInstance方法时，才会加载静态内部类
    // 而静态内部类的的静态属性只会在类首次加载加载时完成初始化，因此既保证线程安全，同时也做到延迟加载
    private static class SingletonLazyInner {
        private static final SingletonLazy instance = new SingletonLazy();
    }
    public static SingletonLazy getInstance() {
        return SingletonLazyInner.instance;
    }
}