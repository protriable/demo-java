package com.protry.model.singleton;

/**
 * 饿汉模式,无线程安全问题，不能延迟加载，影响系统性能
 *
 * 利用了ClassLoader的线程安全机制。
 * ClassLoader的loadClass方法在加载类的时候使用了synchronized关键字。
 * 也正是因为这样， 除非被重写，这个方法默认在整个装载过程中都是同步的（线程安全的）
 */
public class SingletonFive {

    private static SingletonFive instance;

    private SingletonFive(){}

    static {
        instance = new SingletonFive();
    }

    public static SingletonFive getInstance() {
        return instance;
    }
}
