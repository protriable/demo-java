package com.protry.model.singleton;

/**
 * 懒汉模式，线程不安全，会产生多个实例
 */
public class SingletonThree {

    private static SingletonThree instance;

    private SingletonThree(){}

    public static SingletonThree getInstance() {
        if (null == instance) {
            //这个同步会产生多个实例，比2的好处是实例化之后不会进锁影响get的效率
            synchronized (SingletonThree.class) {
                instance = new SingletonThree();
            }
        }
        return instance;
    }
}
