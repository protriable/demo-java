package com.protry.model.singleton;

/**
 * 懒汉模式，线程不安全，不可用
 */
public class SingletonOne {

    private static SingletonOne instance;

    private SingletonOne(){}

    public static SingletonOne getInstance() {
        if (null == instance) {
            instance = new SingletonOne();
        }
        return instance;
    }
}
