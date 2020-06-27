
package com.protry.thread.capOne;

/**
 * @author shaobin
 * @version : SumTest.java, v 0.1 2020年06月01日 9:31 下午 shaobin Exp $
 */
public class SumTest {

    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        Thread thread1 = new Thread(sumThread);
        Thread thread2 = new Thread(sumThread);
        Thread thread3 = new Thread(sumThread);
        Thread thread4 = new Thread(sumThread);
        Thread thread5 = new Thread(sumThread);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}