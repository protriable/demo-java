package com.cloud.thread;

/**
 * @author bshao
 * 静态方法的sync,所以在所有线程中都是互斥的
 */
public class SynchronizedDemo1 {

    public synchronized static void foo1() {

    }

    public synchronized static void foo2() {

    }
}
