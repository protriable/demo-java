package com.protry.model.singleton;

/**
 * 懒汉模式，线程安全
 */
public class SingletonThreeChange {

    private static volatile SingletonThreeChange instance;

    private SingletonThreeChange(){}

    public static SingletonThreeChange getInstance() {
        if (null == instance) {
            synchronized (SingletonThreeChange.class) {
                if (null == instance) {
                    instance = new SingletonThreeChange();
                }
            }
        }
        return instance;
    }
}
