package com.protry.model.singleton;

/**
 * 懒汉模式，线程安全，但效率偏低
 */
public class SingletonTwo {

    private static SingletonTwo instance;

    private SingletonTwo(){}

    public static SingletonTwo getInstance() {
        if (null == instance) {
            instance = new SingletonTwo();
        }
        return instance;
    }
}
