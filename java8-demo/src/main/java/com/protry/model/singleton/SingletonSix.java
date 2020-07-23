package com.protry.model.singleton;

/**
 * 懒汉模式 双重校验锁，线程安全，推荐使用。
 */
public class SingletonSix {

    private static volatile SingletonSix instance;

    private SingletonSix(){}

    public static SingletonSix getInstance() {
        if (null == instance) {
            synchronized (SingletonSix.class) {
                instance = new SingletonSix();
            }
        }
        return instance;
    }
}
