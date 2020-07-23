package com.protry.model.singleton;

/**
 * 懒汉模式
 * 静态内部类，线程安全，主动调用时才实例化，延迟加载效率高，推荐使用。
 * JVM内部机制能够保证一个类在加载的时候，这个类的加载过程是线程互斥的
 *
 * 借助了classloader来实现了线程安全
 *
 * 解决不了序列化对单例的破坏问题
 *
 * 使用ObjectInputStream进行反序列化时，在ObjectInputStream的readObject生成对象的过程中，
 * 其实会通过反射的方式调用无参构造方法新建一个对象
 *
 * 可以通过在Singleton类中定义readResolve的方式，解决该问题
 */
public class SingletonSeven {

    private static class SingletonHolder {
        private static final SingletonSeven INSTANCE = new SingletonSeven();
    }

    private SingletonSeven(){}

    public static SingletonSeven getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
