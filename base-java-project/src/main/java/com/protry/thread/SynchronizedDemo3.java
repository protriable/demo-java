package com.protry.thread;

/**
 * @author bshao
 */
public class SynchronizedDemo3 {

    public void foo5() {
        /**
         * synchronized 与 SynchronizedDemo3 中加synchronized的成员方法互斥
         */
        synchronized (this){}
    }

    public static void foo6() {

        /**
         * synchronized 与 SynchronizedDemo3 中加synchronized的静态方法互斥
         */
        synchronized (SynchronizedDemo3.class) {

        }
    }
}
